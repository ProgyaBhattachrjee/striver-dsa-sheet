package Array;

public class Maximum_Consecutive_One  {
    static int find(int[] arr){
        int l = 0;
        int max = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 1){
                l++;
            }
            else{
                max = Math.max(max, l);
                l = 0;
            }
        }
        max = Math.max(max, l);
        return max;
    }
    public static void main(String[] args) {
        int m = find(new int[] {1, 1, 0, 1, 1, 1});
        System.out.println(m);
    }
}
