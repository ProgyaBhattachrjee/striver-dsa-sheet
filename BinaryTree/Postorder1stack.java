package BinaryTree;

import java.util.Stack;

public class Postorder1stack {
  
    public static void postorder1stack(Node root){
    Stack<Node> s= new Stack<>();
    if(root == null){
        return;
    }
    Node current = root;
    Node last = null;

    while (!s.isEmpty() || current!= null) {
        if(current != null){
            s.push(current);
            current = current.left;
        }
        else{
            Node p = s.peek();
            if(p.right != null && last != p.right){
                current = p.right;
            }
            else{
                System.out.print(p.data+" ");
              last = s.pop();
            }
        }
    }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node root = Create.craeteTree(arr, 0, arr.length);
        postorder1stack(root);
    }
}
