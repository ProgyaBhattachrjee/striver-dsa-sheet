
package linkedlist_mid;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class removeallduplicates {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
 public static ListNode removenodes(ListNode h){
    ListNode t = h;
      while (t != null && t.next != null) {
        if(t.val == t.next.val){
            t.next= t.next.next;
        }
        else{
            t = t.next;
        }
      }
    return h;
 }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);


    print(head);
   System.out.println("remove same val nodes: ");
   print(removenodes(head));
}
}
