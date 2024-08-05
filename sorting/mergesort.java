package sorting;

public class mergesort {

    static void merge(int[] arr,int m,int l,int h){
     
        int[] temp = new int[h - l + 1];
        int n = 0;
        int left = l;
        int right = m + 1;

        while (left <= m && right <= h) {
            if (arr[left] <= arr[right]) {
                temp[n] = arr[left];
                n++;
                left++;
            } else {
                temp[n] = arr[right];
                n++;
                right++;
            }
        }

        while (left <= m) {
            temp[n] = arr[left];
            n++;
            left++;
        }

        while (right <= h) {
            temp[n] = arr[right];
            n++;
            right++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[l + i] = temp[i];
        }

}
    
    static void mergesort(int[] arr,int h,int l){
        if(l == h){
            return;
        }
        int m = (l+h)/2;
        mergesort(arr, m, l);
        mergesort(arr, h, m+1);
         merge(arr, m, l, h);
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
     mergesort(arr, n-1, 0);
     for (int i : arr) {
        System.out.println(i);
     }
    }
}
