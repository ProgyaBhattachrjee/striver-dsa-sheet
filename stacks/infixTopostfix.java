package stacks;

import java.util.Stack;

public class infixTopostfix {
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
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < infix.length(); index++) {
            char c = infix.charAt(index);
            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println("Postfix: " + result);
    }

    public static void main(String[] args) {
        String infix = "(A+B)*(C+D)";
        convert(infix);
    }
}
