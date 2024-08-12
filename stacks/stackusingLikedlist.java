package stacks;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
     this.data = data;
     this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
       }
}
class stack{
    Node top;
    int size;
  stack() {
    this.top = null;
    this.size = 0;
  }
    void push(int x){
        Node e = new Node(x);
        e.next = top;
        top = e;
        size++;
    }
    int pop(){
        if(size == 0){
            System.out.println("empty");
            System.exit(0);
        }
        int d = top.data;
        top= top.next;
        size --;
        return d;
    }
    int top(){
        return top.data;
    }
    int sizes(){
        return size;
    }
}
public class stackusingLikedlist {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
       System.out.println("stack: 1 2 3");
       System.out.println("pop: "+s.pop());
       System.out.println("size: "+s.sizes());
       System.out.println("top element: "+s.top());
    }
}
