import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

public class LinkedList<E> {

    private class Node {

        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //获取链表元素个数
    public int getSize() {
        return size;
    }

    //在链表index处增加一个新元素e
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }


        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;


//            Node newNode = new Node(e);
//            newNode.next = prev.next;
//            prev.next = newNode;
            prev.next = new Node(e, prev.next);

            size++;
        }

    }

    //链表头添加新的元素e
    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
        add(0, e);
    }

    //在链表最后添加一个元素e
    public void addLast(E e) {
        add(size, e);
    }

}
