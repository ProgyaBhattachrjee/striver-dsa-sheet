package BinaryTree;

import java.util.Stack;

public class postorder2stack {
    public static void find(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.add(root);
        while (!s1.empty()) {
            Node c = s1.pop();
             s2.add(c.data);
            if(c.left != null){
                s1.add(c.left);
            }
            if(c.right != null){
                s1.add(c.right);
            }
        }
        System.out.println(s2.reversed());
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
      Node root = Create.craeteTree(arr, 0, arr.length);
      find(root);
    }
}
