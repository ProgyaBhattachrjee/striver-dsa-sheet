package doubleLinkedlist;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d, Node n, Node p) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }

    Node(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}


public class create {
    public static void print(Node h) {
        Node c = h;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = new Node(arr[0]);
        Node c = head;
       for (int i = 1; i < arr.length; i++) {
        Node t = new Node(arr[i],null,c);
        c.next = t;
        c = t;
       }
        print(head);
}

}
