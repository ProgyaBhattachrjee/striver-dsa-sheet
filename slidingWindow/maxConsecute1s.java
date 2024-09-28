package slidingWindow;
import java.util.*;
public class maxConsecute1s {
    public static int solve(String s,int k){
        int max = 0;
        int z = 0;
      int l = 0;
      for (int r = 0; r <s.length(); r++) {
        char c = s.charAt(r);
        if(c == '0'){
            z++;
        }
        if(z > k){
          if(s.charAt(l) == '0'){
            z--;
          }
          l++;
        }
        max = Math.max(max, r-l+1);
      }
        return max;
    }
    public static void main(String[] args) {
       String s = "11100011110";
       int k = 2;
       System.out.println(solve(s,k));
    }
}
