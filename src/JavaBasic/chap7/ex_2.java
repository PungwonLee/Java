package JavaBasic.chap7;

public class ex_2 {

    public static void main(String[] args) {
        Point2 p = new Point2();
        p.x=3;
        p.y=5;
        System.out.println("p = " + p);
    }
}

class Point2 {
    int x;
    int y;

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Parent{
    void parentMethod(){}
}

class Child extends Parent{
    void parentMethod() {}      // 오버라이딩  조상의 메서드에서 재정의
    void parentMethod(int i){}  //오버로딩    이름이 같은 매개변수만 다르게 정의

    void childMethod(){}        //메서드 정의  그냥 메서드 새로 정의
    void childMethod(int i){}   //오버로딩     이름만 같은 매개변수만 다르게 정의
//    void childMethod(){}        //에러, 중복정의

}