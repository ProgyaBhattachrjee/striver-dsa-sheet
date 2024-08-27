package BinaryTree;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Create {
 public static Node craeteTree(int[] arr,int i,int s){
    if(i >= s){
        return null;
    }
    Node node = new Node(arr[i]);
    node.left = craeteTree(arr, 2*i+1, s);
    node.right = craeteTree(arr, 2*i+2, s);

    return node;
 }
    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node root = craeteTree(arr, 0, arr.length);
    }
    
}