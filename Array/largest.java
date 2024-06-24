package Array;
//find Largest Element and Second largest Element in Array
public class largest {
    static int findLargestElement(int arr[]){
        int max  = arr[0];
        int smax = max;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest " + smax);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        System.out.println("largest element "+findLargestElement(arr));
    }
}
