package BinaryTree;

public class MaximumPathSum {
    public static int max = -1;
    public static int calculatesum(Node root){
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, calculatesum(root.left));//-ve eliminate
        int right = Math.max(0, calculatesum(root.right));
        max = Math.max(max, root.data + left + right);
        return root.data + Math.max(left, right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
       calculatesum(root);
       System.out.println(max);
    }
}
