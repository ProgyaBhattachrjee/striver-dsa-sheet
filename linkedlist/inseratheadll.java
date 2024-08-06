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
public class inseratheadll {
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
    public static Node add(Node h,int d){
     return new Node(d,h);
      
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createll(arr);
        System.out.println("Before Linked list: ");
        print(head);
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter data to insert in begining: ");
        int x = myObj.nextInt();
        head =  add(head, x);
         print(head);
         myObj.close();
    }
}
