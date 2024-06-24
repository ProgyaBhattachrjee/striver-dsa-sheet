package Array;

public class LinearSerach {
    static int Find(int [] arr,int n){
     
    for(int i=0;i<n;i++)
    {
        if(arr[i]==n)
        return i;
    }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
    int num = 4;
       System.out.println("Found in Position: " + Find(arr, num));
    }
}
