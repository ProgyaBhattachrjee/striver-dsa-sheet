package stackqueue;

public class trappingrainwater {
 
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        int l = 0,r  = a.length -1,lm = 0,rm = 0;
        int w = 0;
        while (l < r) {
            if(a[l] < a[r]){
                if(lm > a[l]){
                    w += lm - a[l];
                }
                else{
                    lm = a[l];
                }
                l++;
            }
            else{
                if(rm > a[r]){
                    w += rm - a[r];
                }
                else{
                    rm = a[r];
                }
                r--;
            }
        }
     System.out.println("Trapped water: "+ w);
    }
}
