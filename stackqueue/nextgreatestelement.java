package stackqueue;
import java.util.Stack;

public class nextgreatestelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];
        int n = arr.length;

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i % n] >= s.peek()) {
                s.pop();
            }
            if (i < n) {
                if (s.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = s.peek();
                }
            }
            s.push(arr[i % n]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
