package BinaryTree;

public class Diameter {
    public static int calc (Node root){
        if(root == null){
            return 0;
        }
        int lh = Height.count(root.left);
        int rh = Height.count(root.right);
        int ld = calc(root.left);
        int rd = calc(root.right);

        return Math.max(lh+rh+1,Math.max(ld, rd));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node root = Create.craeteTree(arr, 0, arr.length);
        System.out.println("breadh "+calc(root));
    }
}
