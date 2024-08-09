package linkedlist_mid;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class pallindrome {
    public static boolean pallindromes(ListNode h){
        ListNode t = h;
        Stack<Integer> stack = new Stack();
        while(t != null){
            stack.push(t.val);
            t = t.next;
        }
        t = h;
        while(t != null && t.val == stack.pop()){
            t = t.next;
        }
        return t == null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(pallindromes(head));
    }
}
