package sorting;

public class bubblesort {
    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
             int flag = 0;
            for(int j = 0;j < n-i-1;j++){
              if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
                flag =1;
              }
            }
            if(flag == 0){
                break;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
