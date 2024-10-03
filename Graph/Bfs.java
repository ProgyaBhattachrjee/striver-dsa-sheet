import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static ArrayList<Integer> bfarr(ArrayList<ArrayList<Integer>> a,int v){
        ArrayList<Integer> bf = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[v];
         q.add(0);
         vis[0] = 1;
         while (!q.isEmpty()) {
            int node = q.poll();
            bf.add(node);
            for (int i : a.get(node)) {
                if(vis[i] == 0){
                    vis[i] = 1;
                    q.add(i);
                }
            }
         }
        return bf;
    }
   public static void main(String args[]) {
 
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        
        ArrayList<Integer> a = bfarr(adj, 5);
        for (Integer integer : a) {
            System.out.println(integer);
        }
    } 
}
