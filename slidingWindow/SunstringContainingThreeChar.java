package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SunstringContainingThreeChar {
      public static int solve(String s,int k){
        int cnt = 0;
       Map<Character,Integer> mpp = new HashMap<>();
       int l = 0;
       for (int r = 0; r < s.length(); r++) {
        char c = s.charAt(r);
        mpp.put(c, mpp.getOrDefault(c, 0)+1);
        while(mpp.getOrDefault('a', 0) > 0 && mpp.getOrDefault('b', 0) > 0 && mpp.getOrDefault('c', 0) > 0){
            cnt += s.length() - r;
            char lc = s.charAt(l);
            mpp.put(lc, mpp.get(lc)-1);
            if(mpp.get(c) == 0){
                mpp.remove(c);
            }
            l++;
        }
       }
        return cnt;
    }
        public static void main(String[] args) {
        System.out.println(1);
        String s = "abcabc";
        int k = 3;
        System.out.println(solve(s, k));
    }
}
