package Array;

/**
 * Stock
 */
public class Stock {
   static int byesell(int[] arr){
    int max  = 0;
    int min = 10000;
   for(int i = 0;i < arr.length;i++){
    min = Math.min(min, arr[i]);
    max = Math.max(max, arr[i] - min);
   }
    return max;
   }
    public static void main(String[] args) {
          int profit = byesell(new int[] {7,1,5,3,6,4});
          System.out.println(profit);
    }
}