import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleinUndirectedGraph {

    static class Node {
        int first;
        int second;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis) {
        Queue<Node> q = new LinkedList<>(); // BFS
        q.add(new Node(i, -1));
        vis[i] = true;

        // until the queue is empty
        while (!q.isEmpty()) {
            // source node and its parent node
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            // go to all the adjacent nodes
            for (Integer it : adj.get(node)) {
                if (!vis[it]) { // if not visited
                    q.add(new Node(it, node));
                    vis[it] = true;
                }
                // if adjacent node is visited and is not its own parent node
                else if (par != it)
                    return true;
            }
        }
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] vis = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) { // if not visited
                if (checkForCycle(adj, i, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 4; // Number of vertices

        // Initialize adjacency list for the graph
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (Undirected Graph)
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        if (isCycle(adj, v)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Detected");
        }
    }
}
