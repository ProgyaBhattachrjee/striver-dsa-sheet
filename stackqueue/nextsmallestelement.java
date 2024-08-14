package stackqueue;

import java.util.Stack;

public class nextsmallestelement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int[] ans = new int[arr.length];
        int  n = arr.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 2*ans.length-1; i >= 0;i--) {
            while (!s.isEmpty() && s.peek() >= arr[i%n]) {
                s.pop();
            }
            if(i < n){
            if(!s.empty()){
                ans[i] = s.peek();
            }
            else{
                ans[i] = -1;
            }
        }
            s.push(arr[i%n]);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
