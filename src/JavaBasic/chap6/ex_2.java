package JavaBasic.chap6;

class Data {int x;}
public class ex_2 {

    public static void main(String[] args) {
        Data d= new Data();
        d.x =10;
        System.out.println("main() d.x = " + d.x);
        change(d.x);

        System.out.println("After d.x = " + d.x);

        System.out.println("=============참조형===========");
        Data d2= new Data();
        d2.x =10;
        System.out.println("main() d.x = " + d2.x);
        change2(d2);

        System.out.println("After d.x = " + d2.x);
    }

    static void change(int x){      //기본형 매개변수
        x=1000;
        System.out.println("change() x = " + x);
    }

    static void change2(Data d){    //참조형 매개변수
        d.x=1000;
        System.out.println("change() d.x = " + d.x);
    }
}
