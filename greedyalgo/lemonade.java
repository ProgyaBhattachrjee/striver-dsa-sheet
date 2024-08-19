package greedyalgo;

public class lemonade {
    
    public static boolean find(int[] l){
        int f = 0;
        int t = 0;
        for (int i = 0; i < l.length; i++) {
            if(l[i] == 5){
                f++;
            }
            else if(l[i] == 10){
                if(f > 0){
                    f--;
                    t++;
                }
                else return false;
            }
           else{
         if(f >0 && t > 0){
            f--;
            t--;
         }
         else if(f >= 3){
            f -= 3;
         }
         else return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] lemonade = {5,5,10,10,20};
        System.out.println(find(lemonade));
    }
}
