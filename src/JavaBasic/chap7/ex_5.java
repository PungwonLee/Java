package JavaBasic.chap7;

public class ex_5 {             //접근제어자가 public
    private     int prv;        //같은 클래스
                int dft;        //같은 패키지
    protected   int prt;        //같은 패키지+ 자속 (다른패키지더라도 자손이면됨)
    public      int pub;        //접근제한 없음
}
