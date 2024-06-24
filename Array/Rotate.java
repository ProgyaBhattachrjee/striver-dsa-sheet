package Array;

import java.util.Arrays;

//rotate array by n place
public class Rotate {
    static int[] Find(int[] arr){
        int l = arr.length;
        int temp = arr[0];
        for(int i = 0;i < l-1;i++){
            arr[i] = arr[i+1];
        }
        arr[l-1] = temp;
        return arr;
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int n = 3;
        System.out.println(Arrays.toString(arr)+ " after rotaing "+n+ " Times");
       for(int i = 0;i < n;i++){
        arr = Find(arr);
       }
    System.out.println(Arrays.toString(arr));
    }
}
