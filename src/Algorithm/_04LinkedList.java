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

        public void printAll() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }

        public Node<T> search(T data) {
            if (this.head == null) {
                return null;
            } else {
                Node<T> node = this.head;
                while (node != null) {
                    if (node.data == data) {
                        return node;
                    } else {
                        node = node.next;
                    }
                }
                return null;
            }
        }


        public void addNodeInside(T data, T isData) {
            Node<T> searchedNode = this.search(isData);
            if (searchedNode == null) {
                addNode(data);
            } else {
                Node<T> nextNode = searchedNode.next;
                searchedNode.next = new Node<T>(data);
                searchedNode.next.next = nextNode;
            }
        }

        public boolean delNode(T isData) {
            if (this.head == null) {
                return false;
            } else {
                Node<T> node = this.head;
                if (node.data == isData) {
                    this.head = this.head.next;
                    return true;
                } else {
                    while (node.next != null) {
                        if (node.next.data == isData) {
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.delNode(5);
        myLinkedList.printAll();
    }
}
