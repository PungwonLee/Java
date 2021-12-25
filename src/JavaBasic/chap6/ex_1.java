package JavaBasic.chap6;

//하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
public class ex_1{

}

class variables{//참조변수가 사라지면 가비지컬렉터(GC)에 의해 사라진다

    int iv;             //인스턴스 변수 >>> 인스턴스가 생성되었을 때.!
    static int cv;      //클래스 변수(공유변수) >>> 클래스가 매모리에 올라갈 때!

    void method(){
        int lv=0;    //지역 변수 >>>변수 선언문이 수행되었을때 , method가 끝날때까지 유효!
    }
}