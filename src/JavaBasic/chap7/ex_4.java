package JavaBasic.chap7;

public class ex_4 {
    public static void main(String[] args) {
//        AbstractTest a= new AbstractTest(); //에러 인스턴스 생성 불가..
    }
}

abstract class AbstractTest{    //추상클래스 (추상 메서드를 포함한 클래스)
    abstract void move();       //추상메서드 (구현부가 없는 메서드)
}
