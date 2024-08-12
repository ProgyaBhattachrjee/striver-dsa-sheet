package queue;

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

public class create {
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
