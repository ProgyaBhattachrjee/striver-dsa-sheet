package BinerySearchTree;

public class IsBST {
    public static boolean isit(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {8, 14, 45, 64, 100};
        System.out.println(isit(arr));
    }
}
