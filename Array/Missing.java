package Array;

public class Missing {
    static int find(int[] arr,int n){

       int x1 = 0;
       int x2 = 0;
        for(int i = 0;i < n - 1;i++){
            x1 = x1 ^ arr[i];
            x2 = x2 ^ (i+1);
        }
        x2 = x2 ^ n;
        return (x2^x1);
        
    }
    public static void main(String[] args) {
        int a = find(new int[] {1, 2, 4, 5},5);
        System.out.println(a);
    }
}
