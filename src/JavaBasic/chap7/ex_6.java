package JavaBasic.chap7;

public class ex_6 {
    public static void main(String[] args) {
        SmartTv s = new SmartTv();  //참조 변수와 인스턴스 타입이 일치, 7개 기능사용가능
        Tv t= new SmartTv();    //조상 타입 참조 변수로 자손 타입 인스턴스 참조, 5개 기능사용가능
        //이게 바로 다형성.
//         Tv t = new SmartTv();
//         SmartTv s = new Tv();     //에러 , 허용 안됨.
    }
}
class Tv{
    boolean power;
    int channel;

    void power(){ power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
class SmartTv extends Tv{
    String text;
    void caption(){}
}