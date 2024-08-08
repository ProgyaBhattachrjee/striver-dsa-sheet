package doubleLinkedlist;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int d, Node1 n, Node1 p) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }

    Node1(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}


public class insertatend {
    public static void print(Node1 h) {
        Node1 c = h;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }
    }
      public static Node1 add(Node1 h,int e){
        Node1 c = h;
        while (c.next!= null) {
            c = c.next;
        }
        c.next = new Node1(e,null,c);
        c = c.next;
        return h;
      }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node1 head = new Node1(arr[0]);
        Node1 c = head;
       for (int i = 1; i < arr.length; i++) {
        Node1 t = new Node1(arr[i],null,c);
        c.next = t;
        c = t;
       }
        print(head);
        System.out.println("enter data to insert at end: ");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        head = add(head, x);
        System.out.println("new linked list");
      print(head);
}

}
