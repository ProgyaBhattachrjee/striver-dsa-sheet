package slidingWindow;

public class BinerSubarraySum {
    
    public static int solve(int[] arr, int sum) {
        int cnt = 0;
        int l = 0;
        int s = 0;
        
        for (int r = 0; r < arr.length; r++) {
            s += arr[r];
            while (s > sum && l <= r) {
                s -= arr[l];
                l++;
            }

            if (s == sum) {
                cnt += r - l + 1;
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int s = 2;
        System.out.println(solve(arr, s)); 
    }
}
