package BinaryTree;
import java.util.*;
public class RightToleft {
    public static void printTreeRightToLeft(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,9,10};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println("right to left: ");
       printTreeRightToLeft(root);
    }
}
