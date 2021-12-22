package Algorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _02Queue {

    public static class MyQueue<T>{
        private ArrayList<T> queue= new ArrayList<T>();

        public void enqueue(T item){
            queue.add(item);
        }
        public T dequeue(){
            if(queue.isEmpty())  return null;
            return queue.remove(0);
        }
        public boolean isEmpty(){
            return queue.isEmpty();
        }

    }
    public static void main(String[] args) {
        Queue<Integer> queue_int= new LinkedList<Integer>();
        queue_int.add(1);
        queue_int.offer(2); //데이터 추가는 add또는 offer이다
        System.out.println(queue_int);

        queue_int.poll();
        queue_int.remove();   //큐삭제 poll, remove 동일
        Deque<Integer> deque= new LinkedList<>();

        //직접구현한 큐
        MyQueue<Integer> mq= new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }

}
