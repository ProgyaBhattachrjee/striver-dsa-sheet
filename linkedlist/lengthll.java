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
public class lengthll {
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
     public static void count(Node h){
        Node c = h;
        int cnt = 1;
        while (c.next != null) {
            cnt++;
            c = c.next;
        
        }
        System.out.println("size: "+cnt);
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createll(arr);
        System.out.println("Before Linked list: ");
        print(head);
       count(head);
    }
}
