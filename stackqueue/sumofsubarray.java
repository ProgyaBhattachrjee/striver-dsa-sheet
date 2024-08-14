package stackqueue;

public class sumofsubarray {
    public static void main(String[] args) {
        int[] arr ={3,1,2,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                sum += min;
            }
        }
        System.out.println(sum);
    }
}
