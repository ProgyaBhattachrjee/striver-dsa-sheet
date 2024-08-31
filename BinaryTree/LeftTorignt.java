package BinaryTree;
import java.util.*;
public class LeftTorignt {
    public static void printTreeLeftToRight(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,9,10};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println("left to right: \n");
       printTreeLeftToRight(root);
    }
}
