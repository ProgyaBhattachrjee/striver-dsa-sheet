package linkedlist_mid;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class cycle {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
    public static boolean cycles(ListNode h){
        ListNode a = h;
        ListNode b = h;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            if(a == b){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

       System.out.println( "has cycle? :"+cycles(head));
    }
}
