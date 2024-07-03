package Array;

import java.util.Arrays;

public class Sort_array {
    static void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a]= arr[b];
        arr[b] = t;
    }
    static  int[] sort(int[] arr){
        int l = 0;
        int m = 0;
        int h = arr.length - 1;
        while (m <= h) {
            if(arr[m] == 0){
             swap(arr, m,l);
             m++;
             l++;
            }
            else if(arr[m] == 1){
              m++;
            }
            else{
        swap(arr,m,h);
        h--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = sort(new int[]{2,0,2,1,1,0} );
        System.out.println(Arrays.toString(arr));
    }
}
