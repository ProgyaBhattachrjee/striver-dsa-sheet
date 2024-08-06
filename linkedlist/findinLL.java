
package linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d,Node n){
        this.data = d;
        this.next = n;
    }
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class findinLL {
    public static Node createll(int[] arr){
        Node h = new Node(arr[0]);
        Node c = h ;
        for(int i = 1;i < arr.length;i++){
            c.next = new Node(arr[i]);
            c = c.next;
        }
      return h;
    }
    public static void print(Node h){
        Node c = h;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }
    }
     public static void findi(Node h,int e){
        Node c = h;
        int cnt = 0;
        while (c != null) {
            if(c.data == e){
                System.out.println("found "+e+" in "+cnt+ " index");
                return;
            }
            c = c.next;
            cnt++;
        }
        System.out.println("not found");
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createll(arr);
        System.out.println("Linked list: ");
        print(head);
        System.out.println("enter an element to search: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
       findi(head,a);
    }
}
