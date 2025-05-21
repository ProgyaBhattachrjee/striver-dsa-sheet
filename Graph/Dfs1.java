import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
//with stack
public class Dfs1 {
    public static void dfs(int[][] arr, int i,boolean[] vis,Stack<Integer> s) {
        while (!s.isEmpty()) {
            int c = s.pop();
            System.err.println(c);
            for (int n : arr[c]) {
                if (!vis[n]) {
                    vis[n] = true;
                    s.push(n);
                }
            }
        }
    }
    public static void main(String args[]) {
        int[][] arr = { { 2, 3, 1 }, { 0 }, { 0, 4 }, { 0 }, { 2 } };
        boolean[] vis = new boolean[arr.length];
        Arrays.fill(vis, false);
        vis[0] = true;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        dfs(arr, 0,vis,s);
    }
}
