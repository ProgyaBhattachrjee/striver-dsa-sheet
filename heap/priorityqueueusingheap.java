package heap;

public class priorityqueueusingheap {
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

    public static void build(int[] arr,int n){
int si = (n/2) -1;
for (int i = si; i >= 0; i--) {
  heapify(arr, i, n);   
}

    }
    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void delete(int[] arr,int n){
        int last = arr[n-1];
          arr[0] = last;
          n = n-1;
          heapify(arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr  = {4,2,8,16,24,2,4,5};
        build(arr, arr.length);
        print(arr,arr.length);
        System.out.println("\nmax: "+arr[0]);
        delete(arr, arr.length);
        print(arr,arr.length-1);
    }
}
