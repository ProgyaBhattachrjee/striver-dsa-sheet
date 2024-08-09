package linkedlist_mid;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class deletemiddle {
    public static void print(ListNode h) {
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }

    public static void mid(ListNode h) {
        if (h == null || h.next == null) {
            return; // If the list is empty or has only one element, do nothing.
        }

        ListNode a = h;
        ListNode b = h;
        ListNode p = null;

        while (b != null && b.next != null) {
            p = a;
            a = a.next;
            b = b.next.next;
        }

        // p is now the node before the middle node, and a is the middle node
        if (p != null) {
            p.next = a.next; // Delete the middle node by skipping it
        }

        print(h); // Print the list starting from the head
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        print(head);
        System.out.println("After deleting middle node:");
        mid(head);
    }
}
