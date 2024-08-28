package BinaryTree;

public class Height {
    public static int count(Node root){
     if(root == null){
        return 0;
     }
     int l = count(root.left);
     int r = count(root.right);
     return Math.max(l, r)+1;
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println("hight "+count(root));
    }
}
