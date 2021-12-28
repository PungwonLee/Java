package JavaBasic.chap6;

public class ex_3 {
    long a,b;           // iv 인스턴스 번수

    long add(){          //인스턴스 메서드
        return a+b;
    }

    //a와 b는 lv 지역변수
    static long add(long a, long b){  //클래스 메서드 (static 메서드)
        return a+b;
    }

    /*
    인스턴스메서드는 인스턴스 생성 후 참조변수.메서드이름() 으로 호출
    클래스매서드 객체생성없이 클래스이름.메서드이름() 으로 호출

    결론  >  iv 사용여부 : 클래스매서드는 iv사용불가 <-> 인스턴스 메서드는 사용가능
     */

    public static void main(String[] args) {
        System.out.println("==========클래스매서드=========");

        System.out.println(ex_3.add(200L,300L));        //클래스메서드호출
        System.out.println("==========인스턴스매서드=========");
        ex_3 mm =new ex_3();                //인스턴스 생성 (iv생성)
        mm.a=100L;
        mm.b=200L;
        System.out.println(mm.add());       //인스턴스메서드 호출 (iv로 작업)
    }
    //iv를 사용하지 않을 때 클래스매서드 사용하는 것입니다.
    //객체는 iv(지역변수)의 묶음입니다.
}
