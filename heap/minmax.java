package heap;

public class minmax {
    public static void heapify(int[] arr, int i, int n) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;
            heapify(arr, largest, n);
        }
    }

    public static void insert(int[] arr, int n, int k) {
        arr[n] = k;
        int i = n;
        while (i > 0 && arr[(i - 1) / 2] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[(i - 1) / 2];
            arr[(i - 1) / 2] = temp;
            i = (i - 1) / 2;
        }
    }

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void deleteMax(int[] arr, int n) {
        if (n <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        int last = arr[n - 1];
        arr[0] = last;
        n = n - 1;
        heapify(arr, 0, n);
    }

    public static void extractMin(int[] arr, int n) {
        if (n <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        System.out.println("Min: " + arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        int n = 0;
        insert(arr, n++, 4);
        insert(arr, n++, 2);
        extractMin(arr, n);
        insert(arr, n++, 6);
        deleteMax(arr, n--);
        extractMin(arr, n);
        extractMin(arr, n);
        print(arr, n);
    }
}
