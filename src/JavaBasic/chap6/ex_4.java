package JavaBasic.chap6;

import java.util.Arrays;

public class ex_4 {
    long add(int a,int b) {
        return a + b;
    }
    long add(int a,long b){
        return a+b;
    }
    long add(int []a){
        return Arrays.stream(a).sum();
    }

    public static void main(String[] args) {
        ex_4 mm= new ex_4();
        int []a= {1,2,3,4};
        System.out.println(mm.add(1,1));
        System.out.println(mm.add(1,1L));
        System.out.println(mm.add(a));
//        System.out.println(mm.add(1L,1L)); //타입 오류
    }
}
