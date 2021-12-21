package JavaBasic.chap2;

public class ex_1 {
    public static void main(String[] args) {
        int i=100; //10진수
        int oct= 0100; //8진수
        int hex = 0x100;//16진수
        System.out.printf("%d %d %d",i,oct,hex);

        long l= 100; // L 생략가능
        long ll= 10_000_000_000L; // _넣어서 해도 똑같음

        float f = 3.14f; //f는 생략불가
        double d= 3.14d; //d는 생략가능

        /*
        10.   -> 10.0 double
        .10   -> 0.10 double
        10f   -> 10.0f  float
        1e3(10^3)   -> 1000.0  double

         */
        System.out.println(2e4);
        System.out.println(""+7+7); // 문자열 + type = 문자열
        System.out.println(7+7+""); // type +  문자열 = 문자열

        System.out.printf(" [%5d]\n",10); // [   10]
        System.out.printf(" [%-5d]\n",10);// [10   ]
        System.out.printf(" [%05d]\n",10);// [00010]
    }
}
