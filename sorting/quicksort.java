package sorting;

public class quicksort {
    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static int find(int[] arr, int l, int h) {
        int pivot = arr[l];
        int low = l + 1;
        int high = h;

        while (low <= high) {
            while (low <= high && arr[low] <= pivot) {
                low++;
            }
            while (low <= high && arr[high] > pivot) {
                high--;
            }
            if (low < high) {
                swap(arr, low, high);
            }
        }
        swap(arr, l, high);
        return high;
    }

    static void quicsort(int[] arr, int l, int h) {
        if (l < h) {
            int part = find(arr, l, h);
            quicsort(arr, l, part - 1);
            quicsort(arr, part + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        quicsort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
