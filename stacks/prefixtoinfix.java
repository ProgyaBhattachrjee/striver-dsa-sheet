package stacks;
import java.lang.StringBuffer;
import java.util.Stack;
public class prefixtoinfix {
    public static void Convert(String prefix){
        StringBuffer p = new StringBuffer(prefix);
        p.reverse();
        prefix = new String(p);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }
        System.out.println("infix: "+stack.pop());
    }
    public static void main(String[] args) {
        String prefix = new String("*-pq-mn");
           Convert(prefix);
    }
    
}
