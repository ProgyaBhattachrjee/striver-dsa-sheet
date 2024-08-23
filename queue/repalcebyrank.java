package queue;

import java.util.Arrays;
import java.util.HashMap;

public class repalcebyrank {
    
    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
       HashMap<Integer,Integer> h = new HashMap<>();
       for (int i = 0; i < arr1.length; i++) {
        if(h.get(arr1[i]) == null){
            h.put(arr1[i],i+1);
        }
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(h.get(arr[i])+ " ");
    }
    }
}
