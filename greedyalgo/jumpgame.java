package greedyalgo;

public class jumpgame {
    public static boolean find(int[] a, int n) {
        int maxReach = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + a[i]);
        }
        return true;
    }

    public static int pos(int[] a, int n) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + a[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 4};
        int[] b = {1, 2, 3, 1, 1, 0, 2, 5};
        System.out.println(find(a, a.length) + " jumps: " + pos(a, a.length));
        System.out.println(find(b, b.length) + " jumps: " + pos(b, b.length));
    }
}
