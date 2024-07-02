package Array;


public class Longest_Subarray {
 static int find(int arr[],int n,int k){
    int l = 0;
    int s = 0;
    for(int i = 0;i < n;i++){
        s = 0;
        for(int j = i;j < n;j++){
            s+= arr[j];
            if(s == k){
                l = Math.max(l,j - i + 1);
            }
        }
    }
  
      return l;
 }
    public static void main(String[] args) {
        int a = find(new int[] {2,3,5}, 3, 5);
      System.out.println(a);
    }
}
