import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void bfs(int[][] arr,Queue<Integer> q,boolean[] vis,int i){
      while (!q.isEmpty()) {
          int c = q.poll();
          System.err.println(c);
          for (int n : arr[c]) {
              if (!vis[n]) {
                  vis[n] = true;
                  q.add(n);
            }
          }
      }
    }
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 1 }, { 0 }, { 0, 4 }, { 0 }, { 2 } };
        boolean[] vis = new boolean[arr.length];
        Arrays.fill(vis, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        bfs(arr, q, vis, 0);
    }
}
