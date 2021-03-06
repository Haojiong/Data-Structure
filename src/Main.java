import java.util.Random;
import java.util.ArrayList;

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
//        int optCount = 100000;
//
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue, optCount);
//        System.out.println("ArrayQueue, time: " + time1 + "s");
//
//        LoopQueue<Integer> loopQueue = new LoopQueue<>();
//        double time2 = testQueue(loopQueue, optCount);
//        System.out.println("LoopQueue, time: " + time2 + "s");
//
//        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
//        double time3 = testQueue(linkedListQueue, optCount);
//        System.out.println("LinkedListQueue, time: " + time3 + "s");

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
//        int optCount = 1000000;
//
//        ArrayStack<Integer> arrayStack = new ArrayStack<>();
//        double time1 = testStack(arrayStack, optCount);
//        System.out.println("ArrayStack, time: " + time1 + "s");
//
//        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
//        double time2 = testStack(linkedListStack, optCount);
//        System.out.println("LinkedListStack, time: " + time2 + "s");
//        ===========================================================================================================
//        二分搜索树三种顺序的遍历
//        BST<Integer> bst = new BST<>();
//        int[] nums = {5,3,2,4,6,8};
//        for (int num:nums)
//            bst.add(num);
//        bst.preOrder();
//        System.out.println();
//        bst.preOrder();
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();
//        System.out.println();
//        bst.levelOrder();
//
//        System.out.println();
//        System.out.println(bst);
//        ===========================================================================================================
//        二分搜索树删除最小值
//        BST<Integer> bst = new BST<>();
//        Random random = new Random();
//        int n = 1000;
//        for (int i = 0; i < n; i++) {
//            bst.add(random.nextInt(10000));
//        }
//        ArrayList<Integer> nums = new ArrayList<>();
//        while (!bst.isEmpty()) {
//            nums.add(bst.removeMin());
//        }
//        System.out.println(nums);
//        for (int i = 1; i < nums.size(); i++) {
//            if (nums.get(i - 1) > nums.get(i)) {
//                throw new IllegalArgumentException("Error");
//            }
//        }
//        System.out.println("removeMin test completed");
//        ===========================================================================================================
//        二分搜索树删除最大值
//        BST<Integer> bst = new BST<>();
//        Random random = new Random();
//        int n = 1000;
//        for (int i = 0; i < n; i++) {
//            bst.add(random.nextInt(10000));
//        }
//        ArrayList<Integer> nums = new ArrayList<>();
//        while (!bst.isEmpty()) {
//            nums.add(bst.removeMax());
//        }
//        System.out.println(nums);
//        for (int i = 1; i < nums.size(); i++) {
//            if (nums.get(i - 1) < nums.get(i)) {
//                throw new IllegalArgumentException("Error");
//            }
//        }
//        System.out.println("removeMax test completed");
//        ===========================================================================================================
        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt",words1);

        System.out.println("Total words: "+words1.size());

        BST<String> set1 = new BST<>();
        for (String word:words1){
            set1.add(word);
        }

        System.out.println("Total different words: "+set1.size());

        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        FileOperation.readFile("a-tale-of-two-cities.txt",words2);

        System.out.println("Total words: "+words2.size());

        BST<String> set2 = new BST<>();
        for (String word:words2){
            set2.add(word);
        }

        System.out.println("Total different words: "+set2.size());

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
