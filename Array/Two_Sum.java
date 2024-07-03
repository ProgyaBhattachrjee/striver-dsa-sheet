 package Array;

import java.util.Arrays;
import java.util.HashMap;

class Two_Sum {
static int[] find(int[] arr,int t){
    int l = arr.length;
   HashMap<Integer,Integer> mpp = new HashMap<>();
   for(int i = 0;i <  l;i++){
    int want = t - arr[i];
    if(mpp.containsKey(want)){
        return new int[] {mpp.get(want),i};
    }
    mpp.put(arr[i], i);
   }
 return new int[] {-1,-1};
}
    public static void main(String[] args) {
        int[] ans = find(new int[] {2,6,5,8,11}, 14);
        int[] ans1 = find(new int[] {2,6,5,8,11}, 15);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));

    }
}