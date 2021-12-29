package JavaBasic.chap7;

public class ex_3 {

    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x=10;   //super.x
}
class Child2 extends Parent2{
    int x= 20; //this.x
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Point3{
    int x,y;
    Point3(int x,int y){
        //super(); //Object(); 컴파일러가 자동으로 추가
        this.x=x;
        this.y=y;
    }
}
class Point3D3 extends Point3{
    int z;
    Point3D3(int x,int y,int z){ //오류 발생
        //해결 방법은 super(x,y); 를 추가하거나 Point3의 기본생성자를 추가해야한다
        //왜냐하면 첫줄에 super()를 기본으로 삽입하기 때문이다.
//        super();
        super(x,y);             //조상의 생성자
        this.z=z;
    }
}
