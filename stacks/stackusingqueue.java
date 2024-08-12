package stacks;


class Queue {
    int[] arr;
    int max, start, end, currentsize;

    Queue(int max) {
        this.max = max;
        arr = new int[max];
        start = -1;
        end = -1;
        currentsize = 0;
    }

    void push(int x) {
        if (currentsize == max) {
            System.out.println("Queue is full");
            return;
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % max;
        }
        arr[end] = x;
        currentsize++;
    }

    int pop() {
        if (currentsize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int popped = arr[start];
        if (currentsize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % max;
        }
        currentsize--;
        return popped;
    }

    int size() {
        return currentsize;
    }

    int top() {
        if (currentsize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }
}
class stack {
    Queue q ;
    void push(int x){
        q.push(x);
        for (int i = 0; i < q.size(); i++) {
            q.push(q.top());
            q.pop();
        }
    }
    int pop(){
        return q.pop();
    }
    int sizes(){
        return q.size();
    }
    int top(){
        return q.top();
    }

}
public class stackusingqueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("stack: 1 2 3");
        System.out.println("pop: "+s.pop());
        System.out.println("top: "+s.top());
        System.out.println("size: "+s.sizes());
    }
}
