package Array;
//check the array is sorted or not
public class Sorted {
    static boolean Find(int[] arr){
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {5,4,6,7,8};
        System.out.println("{1,2,3,4,5} ,Is it sorted? "+ Find(a1));
        System.out.println("{5,4,6,7,8}, Is it sorted? "+ Find(a2));

    }
}
