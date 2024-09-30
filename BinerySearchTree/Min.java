package BinerySearchTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
public class Min {
    public static int minValue(Node root) {
     int min = root.data;
    while (root.left != null) {
        root = root.left;
        min = root.data;
    }
    return min;
    }
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {8, 14, 45, 64, 100};
        TreeNode root = null;
        for (int num : arr) {
            root = insert(root, num);
        }
    System.out.println("min value: "+minValue(root));
    }
}
