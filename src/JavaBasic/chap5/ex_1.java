package JavaBasic.chap5;

import java.util.Arrays;

public class ex_1 {
    public static void main( String[] args){

        int arr[];
        arr=  new int[5];
        //int arr[] = new int[5];    //이방법도 가능

        // 배열 arr2를 선언 (참조변수) 하고 배열을 생성  <<선언과 생성 동시에.
        int[] arr2 =  new int[5];
        int arrLength = arr2.length;

        int[] arr3 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr3));  //배열 요소 다 출력 | 많이 씀.
    }


}
