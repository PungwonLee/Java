package JavaBasic.chap7;

public class ex_7 {
    public static void main(String[] args) {
        Car car=new Car();
        FireEngine fe= null;    //실제 인스턴스가 무엇인지가 중요 //형변환해도 널포인트 오류발생

        FireEngine fe2= (FireEngine) car;   //조상 -> 자손
        Car car2= fe2;                      //자손 -> 조상
        fe2.water();            //인스턴스는 Car이기 때문에 에러.
    }
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrr~");
    }

    void stop(){
        System.out.println("stop!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water~~~!");
    }
}
