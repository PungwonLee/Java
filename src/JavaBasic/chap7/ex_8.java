package JavaBasic.chap7;

public class ex_8 {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
    }
}

abstract class Player{              //추상클래스 (미완성 클래스)
    boolean pause;
    int currentPos;
    Player(){
        pause=false;
        currentPos=0;
    }
    abstract  void play(int pos);   //추상메서드( 몸통{}이 없는 미완성 메서드)
    abstract  void stop();          //추상 메서드

    void play(){
        play(currentPos);           //추상메서드를 사용할 수 있다.
    }
}
class AudioPlayer extends Player{

    void play(int pos) {
        System.out.println(pos+"위치부터 play합니다");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}


