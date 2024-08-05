package sorting;

public class selectionsort {
    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            int min = i;
        for(int j = i;j < n;j++){
           if(arr[j] < arr[min]){
            min = j;
           
           }
          
        }
        swap(arr,i,min);;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}