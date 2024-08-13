package stacks;

import java.util.Stack;

public class prefixtopostfix {
    public static void Convert(String prefix){
                 Stack<String> stack = new Stack<>();
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            }
        }
        System.out.println("postfix: "+stack.pop());

    }
    public static void main(String[] args) {
        String prefix = "/-ab*+def";
        StringBuffer s = new StringBuffer(prefix);
        prefix = new String(s.reverse());
        Convert(prefix);
    }
}
