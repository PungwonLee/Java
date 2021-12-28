package JavaBasic.chap6;

public class ex_5 {
    String color;
    String gearType;
    int door;

    ex_5(){
        this("white","auto",4);
    }

    ex_5(String color){
        this(color,"auto",4);
    }

    ex_5(String color, String gearType, int door){
        this.door=door;
        this.gearType=gearType;
        this.color=color;
    }
}
