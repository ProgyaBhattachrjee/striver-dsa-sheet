package Array;
import java.util.ArrayList;

public class Leaders {
 static  ArrayList<Integer> find (int[] arr){
   
        ArrayList<Integer> a = new ArrayList<Integer>();
        int max = arr[arr.length - 1];
        a.add(max); 
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                a.add(arr[i]);
                max = arr[i];
            }
        }
        return a;
    
 }
    public static void main(String[] args) {
        ArrayList<Integer> ans = find(new int[] {10, 22, 12, 3, 0, 6});
        System.out.println(ans);
    }
}