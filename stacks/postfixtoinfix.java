package stacks;

import java.util.Stack;

public class postfixtoinfix {
    public static void convert(String postfix){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));

            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op2 + c +op1 +")";
                stack.push(temp);
            }
        }
        System.out.println("infix: "+stack.pop());
    }
    public static void main(String[] args) {
        String postfix = "ab-de+f*/";
        convert(postfix);
    }
}
