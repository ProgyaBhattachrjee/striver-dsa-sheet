package heap;

public class convermintomax {
    public static void heapify(int[] arr,int i,int n){
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        if(l < n && arr[l] >arr[largest]){
            largest = l;
        }
        if(r< n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;
            heapify(arr, largest, n);
        }
    }
    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4};
        int si = (arr.length/2)-1;
        for (int i = si; i >= 0; i--) {
        heapify(arr, i, arr.length);    
        }
         print(arr, arr.length);
    }
}
