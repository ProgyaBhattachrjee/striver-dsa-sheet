package linkedlist_mid;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleLinkedList {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleLinkedList solution = new MiddleLinkedList();
        ListNode middle = solution.middleNode(head);
        System.out.println("The middle node value is: " + middle.val); 
        print(middle);
    }
    public int count(ListNode h) {
        int c = 0;
        ListNode t = h;
        while (t != null) {
            t = t.next;
            c++;
        }
        return c / 2;
    }

    ListNode middleNode(ListNode head) {
        int m = count(head);
        for (int i = 0; i < m; i++) {
            head = head.next;
        }
        return head;
    }
}
