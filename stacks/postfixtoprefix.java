package stacks;

import java.util.Stack;

public class postfixtoprefix {
    public static void convert(String postfix){
        Stack<String> stack = new Stack<>();

        for(int i = 0;i < postfix.length();i++){
            char c = postfix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else{
                String op1 = stack.pop();
                String op2= stack.pop();
                String temp = c + op2 + op1;
                stack.push(temp);
            }
        }
        System.out.println("prefix: "+stack.pop());
    }
    public static void main(String[] args) {
        String postfix = "ab-de+f*/";
        convert(postfix);
    }
}
