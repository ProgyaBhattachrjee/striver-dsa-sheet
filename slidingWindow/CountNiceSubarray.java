package slidingWindow;

public class CountNiceSubarray {
    public static int solve(int[] nums, int k) {
        int l = 0;
        int s = 0;
        int cnt = 0;
        int validSubarrays = 0;

        for (int r = 0; r < nums.length; r++) {
            s += nums[r] % 2;

            while (s > k) {
                s -= nums[l] % 2;
                l++;
            }

            if (s == k) {
                validSubarrays = 0;
                int tempL = l;

                // Count all valid subarrays starting at index l
                while (tempL <= r && nums[tempL] % 2 == 0) {
                    tempL++;
                    validSubarrays++;
                }

                cnt += validSubarrays + 1;  // Add subarrays with exactly k odd numbers
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k = 3;
        System.out.println(solve(arr, k));
    }
}
