package JavaBasic.chap7;

import java.lang.reflect.Member;

public class ex_9 {
}


interface PlayingCard{
    public static final int SPADE=4;    // public static final int SPADE=4;
    final int DIAMOND=3;                // public static final int DIAMOND=3;
    static int HEART=2;                 // public static final int HEART=2;
    int CLOVER=1;                       // public static final int CLOVER=1;

    public abstract String getCardNumber();
    String getCardKind();                   // public abstract String getCardKind();
}

interface Fightable extends Movable, Attackable{} //인터페이스는 다중 상속 가능

interface  Movable{
    void move(int x,int y);
}

interface Attackable{
    void attack(Member member);
}
