package pattern;

public class p10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < 2 * n; i++) {
            int s;
            if (i <= n) {
                s = i;
            } else {
                s = 2 * n - i;
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
