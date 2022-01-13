package Algorithm;

public class _05DoublyLinkedList {
    public static class DoubleLinkedList<T> {
        public Node<T> head = null;
        public Node<T> tail = null;

        public class Node<T> {
            T data;
            Node<T> prev = null;
            Node<T> next = null;

            public Node(T data) {
                this.data = data;
            }
        }

        public void addNode(T data) {
            if (this.head == null) {
                this.head = new Node<T>(data);
                this.tail = this.head;
            } else {
                Node<T> node = this.head;
                while (node.next != null) {
                    node = node.next;
                }
                node.next = new Node<T>(data);
                node.next.prev = node;
                this.tail = node.next;
            }
        }

        public void printAll() {
            Node<T> p = this.head;
            while (p != null) {
                System.out.println(p.data + " ");
                p = p.next;
            }
        }

        public T searchFromHead(T isData) {
            if (this.head == null) {
                return null;
            } else {
                Node<T> node = this.head;
                while (node != null) {
                    if (node.data == isData) {
                        return node.data;
                    }
                    node = node.next;
                }
                return null;
            }
        }

        public T searchFromTail(T isData) {
            if (this.head == null) {
                return null;
            } else {
                Node<T> node = this.tail;
                while (node != null) {
                    if (node.data == isData) {
                        return node.data;
                    }
                    node = node.prev;
                }
                return null;
            }
        }

        public boolean insertToFront(T existedData,T addData){
            if(this.head==null){
                this.head=new Node<T>(addData);
                this.tail=this.head;
                return true;
            }else if(this.head.data==existedData){
                Node<T> newHead= new Node<>(addData);
                newHead.next=this.head;
                this.head=newHead;
                return true;
            }else{
                Node<T> node= this.head;
                while (node!=null) {
                    if (node.data == existedData) {
                        Node<T> nodePrev = node.prev;

                        nodePrev.next = new Node<T>(addData);
                        nodePrev.next.next = node;

                        nodePrev.next.prev = nodePrev;
                        node.prev = nodePrev.next;
                        return true;
                    }
                    node=node.next;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.insertToFront(3,11);
        System.out.println("MyLinkedList.searchFromTail(2) = " + MyLinkedList.searchFromTail(2));
        System.out.println("MyLinkedList.searchFromTail(2) = " + MyLinkedList.searchFromHead(12));
        MyLinkedList.printAll();
    }
}
