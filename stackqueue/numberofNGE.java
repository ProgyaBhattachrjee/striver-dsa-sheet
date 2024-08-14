package stackqueue;

public class numberofNGE {
    public  static void find(int a,int arr[]){
     int x = 0;
     for (int i = 0; i < arr.length; i++) {
        if(arr[i] > a){
            x++;
        }
     }
     System.out.println(x);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] ind = {0,5};
        for (int i = 0; i < ind.length; i++) {
            find(arr[ind[i]], arr);
        }
      

    }
}
