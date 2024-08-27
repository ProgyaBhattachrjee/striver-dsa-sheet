package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public static List<Integer> preorder(Node root){
        List<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
         preorder1(root, l);
        return l;
    }
    public static void preorder1(Node root,List<Integer> l){
        if(root == null) {
            return;
        }
        l.add(root.data);
        preorder1(root.left, l);
        preorder1(root.right, l);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println(preorder(root));
    }
}
