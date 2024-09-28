package slidingWindow;
import java.util.*;
public class LongestRepeatingCharacterWithreplacement {
    public static int solve(String s, int k) {
        int max = 0;
        int maxf = 0;
        Map<Character, Integer> mpp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            maxf = Math.max(maxf, mpp.get(c));

            // Check if the window is valid
            if ((r - l + 1) - maxf > k) {
                char lchar = s.charAt(l);
                mpp.put(lchar, mpp.get(lchar) - 1);
                if (mpp.get(lchar) == 0) {
                    mpp.remove(lchar);
                }
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(solve(s, k));  // Output should be 4
    }
}
