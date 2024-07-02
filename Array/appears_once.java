package Array;

public class appears_once {
    static int find(int[] arr){
        int xor = 0;
        for(int a: arr){
            xor = xor ^ a;
        }
        return xor;
    }
    public static void main(String[] args) {
        int a = find(new int[]  {4,1,2,1,2});
        System.out.println(a);
    }
}
