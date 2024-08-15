
 package stackqueue;

import java.util.Stack;

class astroidcollision {

    public static void main(String[] args) {
        int[] arr = {4,7,1,1,2,-3,-7,17,15,-16};
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                s.push(arr[i]);
            }
            else{
                int f = 0;
                while(!s.isEmpty() &&s.peek() <= (-arr[i])){
                   if(s.peek() == (-arr[i])){
                    s.pop();
                    f = 1;
                      break;
                   }
                    s.pop();
                   
                }
               if(s.isEmpty() && f == 0){
                s.push(arr[i]);
               }
            }
        }
      
        System.out.println(s);
    }
}