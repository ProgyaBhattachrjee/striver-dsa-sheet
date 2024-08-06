package doubleLinkedlist;

import java.util.Scanner;

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


public class insertatend {
    public static void print(Node h) {
        Node c = h;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }
    }
      public static Node add(Node h,int e){
        Node c = h;
        while (c.next!= null) {
            c = c.next;
        }
        c.next = new Node(e,null,c);
        c = c.next;
        return h;
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
        System.out.println("enter data to insert at end: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        head = add(head, x);
        System.out.println("new linked list");
      print(head);
}

}
