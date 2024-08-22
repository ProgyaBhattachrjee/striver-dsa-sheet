package greedyalgo;

import java.util.ArrayList;

public class LRU {
    
    public static void main(String[] args) {
        int[] arr = {5,0,1,3,2,4,1,0,5};
        ArrayList<Integer> a = new ArrayList<>();
        int pf = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!a.contains(pf)){
                pf++;
                a.add(arr[i]);
               
            }
            else{
                a.remove(a.indexOf(pf));
            }
        }
        System.out.println("page fault: "+pf);
    }
}
