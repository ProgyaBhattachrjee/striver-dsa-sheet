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

public class Search {
    public static TreeNode searchBST(TreeNode root, int v) {
        if (root == null || root.val == v) {
            return root;
        }
        if (root.val < v) {
            return searchBST(root.right, v);
        } else {
            return searchBST(root.left, v);
        }
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
        TreeNode result = searchBST(root, 14);

        if (result != null) {
            System.out.println("Found value: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }
}
