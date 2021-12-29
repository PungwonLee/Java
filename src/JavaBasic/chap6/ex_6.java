package JavaBasic.chap6;

public class ex_6 {
    int door=4;                 //기본형(primitive type) 변수의 초기화
    Engine e= new Engine();     //참조형(reference type) 변수의 초기화

    static int[] arr= new int[10];// 명시적 초기화

    static {                        //클래스 초기화 블럭 - 배열 arr을 난수로 채운다.
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*10)+1;
    }
    { door=4;}                      //인스턴스 초기화 블럭
}
class Engine{

}