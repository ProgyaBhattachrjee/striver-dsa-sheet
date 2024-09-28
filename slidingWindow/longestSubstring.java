package slidingWindow;
import java.util.Queue;
import java.util.*;
public class longestSubstring {
    static int solve(String s){
      int max = 1;
      Queue<Character> a = new LinkedList<>();
     for (int i = 0; i < s.length(); i++) {
     char c = s.charAt(i);
     while (a.contains(c)) {
        a.poll();
     }
     a.add(c);
      max = Math.max(max, a.size());
     }

      return max;
    }
    public static void main(String[] args) {
        String s ="abcabcbb";
        System.out.println(solve(s));
    }
}
