package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Pair<U, V> {
    public U first;
    public V second;

    Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}
public class allDfs {
    public static void allinone(Node root){
        if (root == null) return;  // Base case

        Stack<Pair<Node, Integer>> st = new Stack<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> ino = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        
        st.push(new Pair<>(root, 1));

        while (!st.isEmpty()) {
            Pair<Node, Integer> top = st.peek();

            if (top.second == 1) { // Preorder
                pre.add(top.first.data);
                top.second++;
                if (top.first.left != null) {
                    st.push(new Pair<>(top.first.left, 1));
                }
            } else if (top.second == 2) { // Inorder
                ino.add(top.first.data);
                top.second++;
                if (top.first.right != null) {
                    st.push(new Pair<>(top.first.right, 1));
                }
            } else { // Postorder
                post.add(top.first.data);
                st.pop();
            }
        }

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + ino);
        System.out.println("Postorder: " + post);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
        allinone(root);
    }
}
