package stackqueue;


public class sumofsubarrayranges {
    
    public static int min(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                sum += min;
            }
        }
        return sum;
    } 

    public static int max(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i];
            for (int j = i; j < arr.length; j++) {
                m = Math.max(arr[j], m);
                sum += m;
            }
        }
        return sum;
    } 

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        int maxSum = max(arr);
        int minSum = min(arr);
        int result = maxSum - minSum;
        System.out.println("Sum of subarray ranges: " + result);
    }
}