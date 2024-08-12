package stacks;
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
public class create {
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
