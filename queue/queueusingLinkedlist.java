package queue;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
     Node front, rear;
     int size;

     Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int x) {
        Node temp = new Node(x);
        if (rear == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1); // Or handle the empty queue condition differently
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1); // Or handle the empty queue condition differently
        }
        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class queueusingLinkedlist {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("queue: 1 2 3");
        System.out.println("dequeue: "+q.dequeue());
        System.out.println("size: "+q.size());
        System.out.println("top: "+q.peek());
    }
}
