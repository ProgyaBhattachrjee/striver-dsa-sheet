package linkedlist_mid;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class removenthfromlast {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
     public static void Remove(ListNode h,int n){
        ListNode r = new ListNode(0,h);
        ListNode d = r;
        for(int i = 0; i < n;i++){
            h = h.next;
        }
        while(h != null){
            h = h.next;
            d = d.next;
        }
        d.next = d.next.next;
      print(r.next);
     }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

    print(head);
    System.out.println("after deleting:");
     Remove(head, 2);
    }
}
