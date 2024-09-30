package BinaryTree;
import java.util.*;
public class Bottomview {
    public static void Vertical1(Node r){
        Queue<Pair<Node, Pair<Integer, Integer>>> q = new LinkedList<>();
        TreeMap<Integer, List<Integer>> verticalOrderMap = new TreeMap<>();
        q.add(new Pair<>(r, new Pair<>(0, 0)));
        while (!q.isEmpty()) {
            Pair<Node, Pair<Integer, Integer>> a = q.poll(); 
          
            Node t = a.first;
            int v = a.second.first; 
            int h = a.second.second;  
            verticalOrderMap.putIfAbsent(v, new ArrayList<>());
            verticalOrderMap.get(v).add(t.data);
            
            if(t.left != null){
                q.add(new Pair<>(t.left, new Pair<>(v-1, h+1)));
            }
            if(t.right != null){
                q.add(new Pair<>(t.right, new Pair<>(v+1, h+1)));
            }

        }
        List<Integer> firstValues = new ArrayList<>();
        for (int i = -2; i <= 2; i++) {
            if (verticalOrderMap.containsKey(i)) {
                List<Integer> values = verticalOrderMap.get(i);
                firstValues.add(values.get(values.size() - 1)); 
            }
        }
        System.out.println("bottom order " + firstValues);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,9,10};
        Node root = Create.craeteTree(arr, 0, arr.length);
        Vertical1(root);
    }
}