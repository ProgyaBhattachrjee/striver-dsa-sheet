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
public class Floor {
   public static int findCeil(Node root, int key) {
        int ceil = -1;
    
        while (root != null) {
            if (root.data == key) {
                return root.data;
            }
    
            if (root.data > key) {
                root = root.left;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
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
       System.out.println("63 floor value: "+findCeil(root, 63));
       }
}

