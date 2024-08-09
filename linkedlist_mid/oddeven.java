package linkedlist_mid;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class oddeven {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
    public static void oddevens(ListNode h){
        ListNode o = h;
        ListNode e = h.next;
        ListNode eh = e;

        while (o != null && e != null) {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = eh;
   
        print(h);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

    print(head);
    System.out.println("odd even");
    oddevens(head);
    }
}
