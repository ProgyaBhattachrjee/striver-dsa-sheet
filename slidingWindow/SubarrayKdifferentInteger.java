package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubarrayKdifferentInteger {
      public static int solve(int[] nums, int k) {
        return countAtMostK(nums, k) - countAtMostK(nums, k - 1);
      }
  
      private static int countAtMostK(int[] nums, int k) {
          Map<Integer, Integer> freqMap = new HashMap<>();
          int count = 0;
          int left = 0;
  
          for (int right = 0; right < nums.length; right++) {
              // Add current number to the frequency map
              freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);
  
              // If we have more than k distinct integers, shrink the window from the left
              while (freqMap.size() > k) {
                  freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                  if (freqMap.get(nums[left]) == 0) {
                      freqMap.remove(nums[left]);
                  }
                  left++;
              }
              count += right - left + 1;
          }
  
          return count;
      }
        public static void main(String[] args) {
       int[] arr = {9,7,7,9,7,7,9};
       int k = 7;
       System.out.println(solve(arr, k));
    }
}
