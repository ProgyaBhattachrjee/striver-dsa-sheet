package greedyalgo;


public class fractional_knapsack {
    public static int find(int[] w,int[] v,int weight){
         int t = 0;
        for (int i = 0; i < v.length; i++) {
            if(w[i] <= weight){
                weight -= w[i];
                t+=v[i];
            }
            else{
                t+= (v[i]/w[i])*weight;
            }
        }
        return t;
    }
public static void main(String[] args) {
    int[] w = {20,10,30};
    int[] v = {100,60,120};
    int weight = 50;
    System.out.println(find(w, v, weight));
}
    
}