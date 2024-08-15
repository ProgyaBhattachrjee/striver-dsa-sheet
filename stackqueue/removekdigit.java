package stackqueue;

import java.util.Stack;

public class removekdigit {
    public static void main(String[] args) {
       String num = "10200";
       int k = 1;
       if(num.length() == 1 && k == 1){
        System.out.println(0);
        System.exit(0);
       }
       Stack<Character> s = new Stack<>();
       for (char c : num.toCharArray()) {
        if(!s.isEmpty() && s.peek() >= c && k > 0){
            s.pop();
            k--;
        }
       s.push(c);
      
       }
       StringBuilder sb = new StringBuilder();
       for (Character character : s) {
        sb.append(character);
       }
       if(sb.charAt(0) == '0'){
        sb.deleteCharAt(0);
     }
       System.out.println(sb.length() > 0 ? sb.toString() : "0");
    }
}
