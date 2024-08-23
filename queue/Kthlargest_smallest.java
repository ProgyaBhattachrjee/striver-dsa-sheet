package queue;

import java.util.PriorityQueue;

public class Kthlargest_smallest {
    public static void largest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int kk = k;
           while (kk > 1) {
            pq.remove();
            kk--;
           }
        System.out.println(k+"th largest: "+pq.peek());
    }
    public static void smallest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int kk = k;
           while (kk > 1) {
            pq.remove();
            kk--;
           }
        System.out.println(k+"th smallest: "+pq.peek());
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5, 3}  ;
        largest(arr, 3);
        smallest(arr, 3);
    }
}
