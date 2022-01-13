package Algorithm;

import java.util.ArrayList;

public class BackTracking {
    public boolean isAvailable(ArrayList<Integer> candidate,Integer curCol){
        Integer curRow= candidate.size();
        for(int i=0;i<curRow;i++){
            if(candidate.get(i)==curCol|| (Math.abs(candidate.get(i)-curCol)==curRow-i)){
                return false;
            }
        }
        return true;
    }
    public void dfsFunc(Integer N, Integer curRow, ArrayList<Integer> curCandidate) {
        if (curRow == N) {
            System.out.println(curCandidate);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (this.isAvailable(curCandidate,i)==true){
                curCandidate.add(i);
                this.dfsFunc(N,curRow+1,curCandidate);
                curCandidate.remove(curCandidate.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        BackTracking backTracking= new BackTracking();
        backTracking.dfsFunc(4,0,new ArrayList<Integer>());
    }
}
