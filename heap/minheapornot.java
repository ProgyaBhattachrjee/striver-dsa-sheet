package heap;

public class minheapornot {
    public static boolean isMinHeap(int[] arr, int n) {
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[i] > arr[2 * i + 1]) {
                return false;
            }
            if (2 * i + 2 < n && arr[i] > arr[2 * i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {90, 15, 10, 7, 12, 2};
        int n = arr.length;
        if (isMinHeap(arr, n)) {
            System.out.println("The array is a min-heap.");
        } else {
            System.out.println("The array is not a min-heap.");
        }
    }
}
