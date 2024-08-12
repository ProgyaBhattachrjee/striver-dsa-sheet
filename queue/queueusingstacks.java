package queue;

class stack{
int size = 1000;
int[] arr = new int[size];
int top = -1;
void push(int x){
top++;
arr[top] = x;
}
int pop(){
    int x = arr[top];
    top--;
    return x;
}
int top(){
    return arr[top];
}
int sizes(){
    return top+1;
}
}

class queue{
    stack s1 = new stack();
    stack s2 = new stack();
    void push(int x){
     s2.push(s1.pop());
     s1.push(x);
     s1.push(s1.pop());
    }
    int pop(){
        return s1.pop();
    }
    int size(){
        return s1.sizes();
    }
    int top(){
        return s1.top();
    }
}
public class queueusingstacks {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println("Queue: 1 2 3 4");
        System.out.println("Pop: " + q.pop());
        System.out.println("Size: " + q.size());
        System.out.println("Top: " + q.top());
    }
}
