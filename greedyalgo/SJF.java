package greedyalgo;

import java.util.Arrays;

public class SJF {
    
    public static void main(String[] args) {
        int[] arr={4,3,7,1,2};
        Arrays.sort(arr);
        int t = 0,wt = 0;
        for (int i = 0; i < arr.length; i++) {
            wt+= t;
            t+=arr[i];
        }
        System.out.println("avg waitingTime: "+wt/arr.length);
        }
}
