package BinaryTree;

public class Balancedornot {
  
    public static int check(Node root){
        if (root == null)
        return 0;
    int lh = check(root.left);
    if (lh == -1)
        return -1;
    int rh = check(root.right);
    if (rh == -1)
        return -1;

    if (Math.abs(lh - rh) > 1)
        return -1;
    else
        return Math.max(lh, rh) + 1;
    }
    public static void main(String[] args) {
        int[] arr =  {10,5,30,15,20};
        Node root = Create.craeteTree(arr, 0, arr.length);
        if(check(root) > 0){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}
