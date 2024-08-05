package sorting;

public class insertionsort {
    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        for(int i = 0;i <= n-1;i++){
              int j = i;
           while(j > 0 && arr[j-1] > arr[j]){
                swap(arr, j, j-1);
              j--;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
