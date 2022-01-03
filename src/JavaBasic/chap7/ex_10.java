package JavaBasic.chap7;

import java.lang.reflect.Member;

abstract class Unit{
    int x,y;
    abstract void move(int x,int y);
    void stop(){
        System.out.println("멈춥니다");
    }
}
interface Figthable{            //인터페이스의 모든 메서드는 public abstarct. 예외없이
    void move(int x,int y); //public abstract가 생략됨
    void attack(Figthable f); //public abstract가 생략됨
}

class Fighter extends Unit implements Figthable{
    //오버라이딩 규칙: 조상(public)보다 접근 제어자가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }

    public void attack(Figthable f) {
        System.out.println(f+"를 공격");
    }
}



public class ex_10 {
    public static void main(String[] args) {
//        Unit f= new Fighter();
        Figthable f= new Fighter();
        f.move(100,200);
        Fighter f2 =new Fighter();
        f.attack(f2);
    }
}
