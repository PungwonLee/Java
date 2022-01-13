package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _01Array {
    public static void main(String[] args){
        List<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //List는 인터페이스 , ArrayList는 클래스

        list1= new LinkedList<>();  //인터페이스라 유연성제공
        //  list2= new LinkedList<>(); 클래스라 안됨
        // 웬만하면 클래스를 동일하게 한다. ex) 10번 라인
        list1.add(1);   //아이템 삽입
        list1.add(2);
        list1.get(0);   //아이템 읽기

        list1.set(0,5); //특정인덱스에 아이템값변경
        list1.remove(0); //특정 인덱스 아이템 삭제
        list1.size();   //아이템 갯수(길이)

        String str="1231235ss";
        str.indexOf('2');// 문자열안에 2가 있는지 반환 있으면 인덱스 번호 없으면 -1 반환환

    }}
