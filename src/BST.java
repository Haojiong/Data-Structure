import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    //用递归方法向二分搜索树添加元素
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    //递归方法查询二分搜索树中的元素
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }

        if (node.e.equals(e)) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    //递归方法前序遍历
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //非递归方法前序遍历
    public void preOrderNR() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);

            if (cur.right!=null){
                stack.push(cur.right);
            }
            if (cur.left!=null){
                stack.push(cur.left);
            }
        }
    }


    public void inOrder() {
        inOrder(root);
    }

    //递归方法中序遍历
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    //递归方法中序遍历
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    //层序遍历
    public void levelOrder(){
       Queue<Node> q = new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
           Node cur = q.remove();
           System.out.println(cur.e);

           if(cur.left!=null){
               q.add(cur.left);
           }
           if(cur.right!=null){
               q.add(cur.right);
           }
       }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private String generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return res.toString();
        } else {
            res.append(generateDepthString(depth) + node.e + "\n");
        }

        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
        return res.toString();
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }
}
