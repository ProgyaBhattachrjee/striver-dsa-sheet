package BinaryTree;
import java.util.ArrayList;
import java.util.List;
public class Inorder {
    public static List<Integer> inorder(Node root){
        List<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        inorder1(root, l);
        return l;
    }
    public static void inorder1(Node root,List<Integer> l){
        if(root == null){
            return;
        }
        inorder1(root.left, l);
         l.add(root.data);
        inorder1(root.right,l);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println(inorder(root));
    }
}
