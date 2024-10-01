import java.util.ArrayList;
import java.util.List;

public class createGraph {
     public static List<List<Integer>> printGraph(int V, int edges[][]) {
      List<List<Integer>> l = new ArrayList<>();
      for (int i = 0; i < V; i++) {
        l.add(new ArrayList<>());
    }
      for (int[] e : edges) {
        int u = e[0];
        int v = e[1];
        l.get(u).add(v);
        l.get(v).add(u);

      }
      return l;
    }
    public static void main(String[] args) {
        int V = 5;
        int edges[][] = {
            {0, 1}, {0, 4}, {4, 1}, {4, 3}, {1, 3}, {1, 2}, {3, 2}
        };
           List<List<Integer>> a = printGraph(V, edges);
           for (List<Integer> list : a) {
            System.out.println(list);
           }
    }
}
