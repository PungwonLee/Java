import java.io.*;
import java.util.*;

class Solution {


    public static void main(String[] args) {
//        int [][] needs = { { 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
        int [][] needs = { { 0, 0, 1 }, {0, 1, 1}, {0, 1, 1}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
        int r=4;

        int answer = 0;
        Map<Integer, Integer> ht = new HashMap<Integer, Integer>();
        for(int i=0;i<15;i++)ht.put(i,0);

        for(int i=0;i<needs.length;i++){
            for(int j=0;j<needs[i].length;j++){
                if( needs[i][j]==1) ht.put(j,ht.get(j)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(ht.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int[]res= new int[r];
        for(int i=0;i<r;i++){
            res[i]=(entryList.get(i).getKey());

        }

        for(int i=0;i<needs.length;i++){
            boolean flag=true;
            for(int j=0;j<needs[i].length;j++){
                if( needs[i][j]==1) {
                    boolean check=false;

                    for(int k=0;k<r;k++)
                        if(j== res[k]) check=true;

                    if (check==false) flag=false;
                }
            }
            if(flag)answer+=1;
        }
        System.out.println(answer);
    }
}
