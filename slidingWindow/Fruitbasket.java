package slidingWindow;
import java.util.*;
public class Fruitbasket {
     public static int solve(int[] arr,int busket){
        int max = 0;
       Map<Integer,Integer> mpp = new HashMap<Integer,Integer>(); 
       int l = 0;
       for (int r = 0; r < arr.length; r++) {
          mpp.put(arr[r], mpp.getOrDefault(arr[r], 0)+1);
         if(mpp.size() > busket){
            mpp.put(arr[l], mpp.get(arr[l])-1);
            if(mpp.get(arr[l]) == 0){
                mpp.remove(arr[l]);
            }
            l++;
         }
          max = Math.max(max, r - l+1);
       }
        return max;
     }
    public static void main(String[] args) {
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        int busket = 2;
        System.out.println(solve(arr, busket));
    }
}
