package slidingWindow;

public class MaximumPointsCard {
    public static int solve(int[] arr,int k){
        int sum = 0;
         int lsum =0,rsum = 0, l = 0,r = arr.length-1;
      
           for (int i = 0; i < k; i++) {
               lsum += arr[i];
               sum = lsum;
           }
           for (int i = k-1; i >= 0 ; i--) {
               lsum -= arr[i];
               rsum += arr[r];
               r--;
               sum = Math.max(sum, rsum+lsum);
           }
           
   
        return sum;
       }
           public static void main(String[] args) {
          int[] arr = {9,7,7,9,7,7,9};
          int k = 7;
          System.out.println(solve(arr, k));
       }
}
