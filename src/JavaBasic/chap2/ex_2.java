package JavaBasic.chap2;
import java.util.*;
public class ex_2 {
    public static void main(String[] args) {
        //객체의 생성
        Scanner scanner = new Scanner(System.in); // System.in 화면입력
        //Scanner 객체를 사용
        int num =scanner.nextInt();
        System.out.println("num = " + num);


        System.out.println(123+"");        //숫자 -> 문자열
        System.out.println(Integer.parseInt("33"));  //문자열 -> 숫자
    }
}
