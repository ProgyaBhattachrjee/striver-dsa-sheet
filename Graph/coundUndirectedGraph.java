public class coundUndirectedGraph {
    public static int count(int n){
        int x = n*(n-1)/2;
    
        return (int) Math.pow(2,x);
    }
    public static void main(String[] args) {
        int n  =5;
        System.out.println("no of undirected graph for "+n+" edges "+count(n));
    }
}
