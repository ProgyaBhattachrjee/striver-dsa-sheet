package pattern;

public class p16 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= n;i++){
            for(char j = 'A';j <='A' +(n-i-1);j++){
             System.out.print(j);
            }
            System.out.println();
        }
    }
}
