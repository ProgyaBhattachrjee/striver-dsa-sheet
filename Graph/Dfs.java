import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
//without stack
public class Dfs {
    public static void dfs(int[][] arr, int i,boolean[] vis) {
        System.err.println(i);
        for (int n : arr[i]) {
            if (!vis[n]) {
                vis[n] = true;
                dfs(arr, n, vis);
            }
        }
    }
    public static void main(String args[]) {
        int[][] arr = { { 2, 3, 1 }, { 0 }, { 0, 4 }, { 0 }, { 2 } };
        boolean[] vis = new boolean[arr.length];
        Arrays.fill(vis, false);
        vis[0] = true;
        dfs(arr, 0,vis);
    }
}
