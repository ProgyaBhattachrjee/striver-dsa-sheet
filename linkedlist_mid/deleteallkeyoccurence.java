package linkedlist_mid;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class deleteallkeyoccurence {
    public static void print(ListNode h){
        ListNode c = h;
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }
   public static ListNode del (ListNode h,int k){
    while(h.val == k){
        h = h.next;
    }
      ListNode a = h;
      ListNode b = a;
      while(a != null && a.next != null){
        if(a.next.val == k){
            a.next = a.next.next;
       
        }
        else{
            a = a.next;
        }
      }
    return h;
   }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(2);
         print(head);
         System.out.println("new List: ");
       print(del(head, 2));
    }
}
