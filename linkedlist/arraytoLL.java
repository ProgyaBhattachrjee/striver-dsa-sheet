package linkedlist;
class Node {
    int data;     
    Node next;      

    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class arraytoLL {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node h = new Node(arr[0]);
        Node c = h;
        System.out.print(c.data+ "->");
        for(int i = 1;i < arr.length;i++){
          
          c.next = new Node(arr[i]);
          c = c.next;
          System.out.print(c.data+ "->");
        }
  
    }
}
