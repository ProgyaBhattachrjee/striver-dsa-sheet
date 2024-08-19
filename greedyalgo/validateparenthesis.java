package greedyalgo;

import java.util.Stack;

public class validateparenthesis {
    public static boolean find(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(') {
                openStack.push(i);
            } else if (character == '*') {
                starStack.push(i);
            } else {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.pop() > starStack.pop()) {
                return false;
            }
        }

        return openStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(find(s)); // Output: true
    }
}
