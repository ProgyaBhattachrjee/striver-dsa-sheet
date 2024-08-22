package greedyalgo;

public class Candy {
    
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                res[i] = res[i - 1] + 1;
            }
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                res[i] = Math.max(res[i], res[i + 1] + 1);
            }
        }
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
