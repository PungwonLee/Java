package Algorithm;

public class _04LinkedList {


    public static class SingleLinkedList<T> {
        public Node<T> head = null;

        public class Node<T> {
            T data;
            Node<T> next = null;

            public Node(T data) {
                this.data = data;
            }
        }

        public void addNode(T data) {
            if (head == null)
                head = new Node<T>(data);
            else {
                Node<T> node = this.head;
                while (node.next != null)  //마지막 노드로 이동
                    node = node.next;
                node.next = new Node<T>(data);

            }
        }

        public void printAll(){
            Node p=head;
            while(p!=null){
                System.out.print(p.data+" ");
                p=p.next;
            }
        }

    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<>();
        myLinkedList.addNode(123);
        myLinkedList.addNode(2);

        myLinkedList.printAll();
    }
}
