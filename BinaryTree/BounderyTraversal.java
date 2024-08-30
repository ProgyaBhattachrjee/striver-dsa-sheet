package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BounderyTraversal {
    
    public static boolean isLeaf(Node r) {
        return r.left == null && r.right == null;
    }

    public static void addLeftBoundary(Node r, List<Integer> res) {
        r = r.left;
        while (r != null) {
            if (!isLeaf(r)) {
                res.add(r.data);
            }
            if (r.left != null) {
                r = r.left;
            } else {
                r = r.right;
            }
        }
    }

    public static void addLeafNodes(Node r, List<Integer> res) {
        if (isLeaf(r)) {
            res.add(r.data);
            return;
        }
        if (r.left != null) {
            addLeafNodes(r.left, res);
        }
        if (r.right != null) {
            addLeafNodes(r.right, res);
        }
    }

    public static void addRightBoundary(Node r, List<Integer> res) {
        List<Integer> tmp = new ArrayList<>();
        r = r.right;
        while (r != null) {
            if (!isLeaf(r)) {
                tmp.add(r.data);
            }
            if (r.right != null) {
                r = r.right;
            } else {
                r = r.left;
            }
        }
        for (int i = tmp.size() - 1; i >= 0; i--) {
            res.add(tmp.get(i));
        }
    }

    public static List<Integer> boundaryTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (!isLeaf(root)) {
            res.add(root.data);
        }
        addLeftBoundary(root, res);
        addLeafNodes(root, res);
        addRightBoundary(root, res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Node root = Create.craeteTree(arr, 0, arr.length);
        List<Integer> res = boundaryTraversal(root);
        System.out.println(res);
    }
}