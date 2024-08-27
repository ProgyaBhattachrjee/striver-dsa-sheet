package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static List<List<Integer>> levelorder(Node root){
        List<List<Integer>> l = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
       while (!q.isEmpty()) {
        List<Integer> a = new ArrayList<>();
        int s = q.size();
        for (int i = 0; i < s; i++) {
            Node c = q.poll();
            if(c.left != null){
                q.add(c.left);
            }
            if(c.right != null){
                q.add(c.right);
            }
           a.add(c.data);
        }
      l.add(a);
       }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println(levelorder(root));
    }
}
