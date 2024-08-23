package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ksortedarray {
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0] -b[0]);
        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{arr[i][0],i,0});
        }
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            System.out.print(curr[0]+" ");
            int i = curr[1];
            int ei = curr[2];
            if (ei + 1 < arr[i].length) {
                pq.add(new int[]{arr[i][ei + 1],i,ei + 1});
            }
        }
    }
}
