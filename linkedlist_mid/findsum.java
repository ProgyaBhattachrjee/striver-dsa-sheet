package linkedlist_mid;

import java.util.ArrayList;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class findsum {
    public static void print(ListNode h){
        ListNode c = h;
    
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
    public static void findPairsWithGivenSum(int target, ListNode head){
      HashSet<Integer> ans = new HashSet<>();
      ListNode t = head;
      while (t != null) {
        int c = target - t.val;
        if(ans.contains(c)){
          System.out.println("( "+t.val +" , "+c+" )");
        }
        ans.add(t.val);
        t = t.next;
      }
      
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
      System.out.println("the LinkedList: ");
    print(head);
    System.out.println("sum of 7: ");
    findPairsWithGivenSum(7, head);
    }
}

