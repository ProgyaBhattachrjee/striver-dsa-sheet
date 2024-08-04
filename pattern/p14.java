package pattern;

public class p14 {
    public static void main(String[] args) {
        int n = 6;
        int x = 1;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
