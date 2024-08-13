package stacks;

import java.util.Stack;

public class infixtoprefix {
    public static String reverse(String s) {
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '(') {
                s1.setCharAt(i, ')');
            } else if (s1.charAt(i) == ')') {
                s1.setCharAt(i, '(');
            }
        }
        return s1.toString();
    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void convert(String infix) {
        Stack<Character> stack = new Stack<>();
        String ans = new String("");
        infix = reverse(infix);

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                ans += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    ans += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        ans = reverse(ans);
        System.out.println("Prefix: " + ans);
    }

    public static void main(String[] args) {
        String infix = "(a+b)*c-d+f";
        convert(infix);
    }
}
