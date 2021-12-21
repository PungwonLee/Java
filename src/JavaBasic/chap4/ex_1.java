package JavaBasic.chap4;

public class ex_1 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 19; j++) {
                if (j == 3)
                    break Loop1;
                System.out.println(i);
            }
        }
    }
}
