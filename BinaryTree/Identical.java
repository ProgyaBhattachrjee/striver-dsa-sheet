package BinaryTree;

public class Identical {
    public static boolean find (Node r1,Node r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        return  ((r1.data == r2.data )&& find(r1.left, r2.left)&&find(r1.right, r2.right));
    }
    public static void main(String[] args) {
        int[] arr1 =  {10,5,30,15,20};
        Node root1= Create.craeteTree(arr1, 0, arr1.length);
        int[] arr2 =  {10,5,30,5,20};
        Node root2= Create.craeteTree(arr2, 0, arr2.length);
        System.out.println("indentical? "+find(root1, root2));
    }
}
