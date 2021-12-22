package Algorithm;
//단점: 데이터 최대 갯수를 미리 정해야한다.

import java.util.ArrayList;
import java.util.Stack;

public class _03Stack {
    public static class MyStack<T> {
        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item) {
            stack.add(item);
        }

        public T pop() {
            if (stack.isEmpty()) return null;
            return stack.remove(stack.size() - 1);
        }
        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        stack_int.pop(); // 3출력

        //직접구현 스택
        MyStack<Integer> ms= new MyStack<>();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
