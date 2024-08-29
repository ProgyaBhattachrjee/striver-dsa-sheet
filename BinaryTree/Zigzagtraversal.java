package BinaryTree;
import java.util.*;
public class Zigzagtraversal {
    public static List<List<Integer>> zigzag(Node r){
      List<List<Integer>> l = new ArrayList<>();
       boolean lr = true;
       Queue<Node> a = new LinkedList<>();
        a.add(r);
        while (!a.isEmpty()) {
            int s = a.size();
            List<Integer> b = new ArrayList<>(Collections.nCopies(s, 0));
            for (int i = 0; i < s; i++) {
                Node n= a.poll();
                int index = lr? i : (s-i-1);

                b.set(index,n.data);
                if(n.left != null){
                    a.add(n.left);
                }
                if(n.right != null){
                    a.add(n.right);
                }

            }
            l.add(b);
            lr = !lr;
        }
      return l;
    }
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,6};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println(zigzag(root));
    }
}
