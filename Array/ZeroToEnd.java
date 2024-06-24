package Array;

import java.util.Arrays;

public class ZeroToEnd {
    static int[] Find(int[] arr){
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
       arr[i] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        arr = Find(arr);
        System.out.println(Arrays.toString(arr));
    }
}
