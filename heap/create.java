package heap;
import java.util.Comparator;
import java.util.PriorityQueue;

class Priorityq{
    PriorityQueue<Integer> m;
    Priorityq(){
    m = new PriorityQueue<>();
    }
    void push(int x){
        m.offer(x);
    }
    int pop(){
        return m.poll();
    }
    int top(){
        return m.peek();
    }
}
public class create {
 public static void main(String[] args) {
    int[] a ={4 ,2 ,8 ,16 ,24 ,2 ,6 ,5};
    Priorityq p = new Priorityq();
    for (int i : a) {
        p.push(i);
    }
    System.out.println("largest element: "+p.pop());
    System.out.println("all elements: "+p.m);
 }
    
}
