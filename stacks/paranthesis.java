package stacks;

import java.util.Stack;

public class paranthesis {
    public static boolean check(String st){
       Stack<Character> s = new Stack<>();
       for(char i : st.toCharArray()){
        if(i == '(' || i == '{' || i == '['){
            s.add(i);
        }
        else{
            if(s.empty()) return false;
            char c = s.pop();
            if((i == ')' && c == '(')|| (i == '}' && c == '{')|| (i == ']' && c == '[')){
             continue;
            }
            else{
                return false;
            }
        }
       }
        return true;
    }
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(s + " is? "+check(s));
        s = "({[(]})";
        System.out.println(s + " is? "+check(s));
    }
}
