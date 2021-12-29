package JavaBasic.chap7;

public class ex_1 {

}

class Point{
    int x;
    int y;
}

class Point3D extends Point{
    int z;
}

class Circle{       //포함관계
    Point c= new Point(); //원점
    int r;
}

class Circle2 extends Point{ //상속관계
    int r;
}

//class tv extends Point,ex_1{        //에러 조상은 하나만 허용된다.
//
//}