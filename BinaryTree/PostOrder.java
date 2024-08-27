package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static List<Integer> postorder(Node root){
        List<Integer> l = new ArrayList<>();
        if(root == null ){
            return l;
        }
        postorder1(root, l);
     return l;
    }
    public static void postorder1(Node root,List<Integer> l){
        if(root == null) return;
        postorder1(root.left, l);
        postorder1(root.right, l);
         l.add(root.data);
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7};
      Node root = Create.craeteTree(arr, 0, arr.length);
      System.out.println(postorder(root));
    }
}
