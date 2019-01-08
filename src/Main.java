import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Array的测试代码
//        Array<Integer> arr = new Array();
//        for (int i = 0;i<10;i++){
//            arr.addLast(i);
//        }
//        System.out.println(arr);
//
//        arr.add(1,100);
//        System.out.println(arr);
//
//        arr.addFirst(-1);
//        System.out.println(arr);
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
//
//        arr.removeLast();
//        System.out.println(arr);
//
//        arr.remove(5);
//        System.out.println(arr);
//
//        arr.removeLast();
//        System.out.println(arr);
//
//        arr.removeLast();
//        System.out.println(arr);
//
//        arr.removeLast();
//        System.out.println(arr);
//        ==========================================================================================================

//        ArrayStack的测试代码
//        ArrayStack<Integer> stack = new ArrayStack<>();
//
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);

//        ===========================================================================================================
//        ArrayQueue和LoopQueue的性能测试
//        int optCount = 1000000;
//
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue, optCount);
//        System.out.println("ArrayQueue, time: " + time1 + "s");
//
//        LoopQueue<Integer> loopQueue = new LoopQueue<>();
//        double time2 = testQueue(loopQueue, optCount);
//        System.out.println("LoopQueue, time: " + time2 + "s");

//        ===========================================================================================================

//        LinkedList的测试代码
//        LinkedList<Integer> linkedlist = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedlist.addFirst(i);
//            System.out.println(linkedlist);
//        }
//
//        linkedlist.add(2,666);
//        System.out.println(linkedlist);
//
//        linkedlist.remove(2);
//        System.out.println(linkedlist);
//
//        linkedlist.removeFirst();
//        System.out.println(linkedlist);
//
//        linkedlist.removeLast();
//        System.out.println(linkedlist);
//        ==========================================================================================================

//        LinkedListStack的测试代码
//        LinkedListStack<Integer> stack = new LinkedListStack<>();
//
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);
//        ===========================================================================================================
//        ArrayStack和LinkedListStack的性能测试
        int optCount = 1000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, optCount);
        System.out.println("ArrayStack, time: " + time1 + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, optCount);
        System.out.println("LinkedListStack, time: " + time2 + "s");


    }

    //测试enqueue和dequeue的时间
    private static double testQueue(Queue<Integer> q, int queCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < queCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < queCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    //测试push和pop的时间
    private static double testStack(Stack<Integer> q, int queCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < queCount; i++) {
            q.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < queCount; i++) {
            q.pop();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
