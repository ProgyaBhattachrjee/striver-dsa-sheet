package pattern;

public class p18 {
    public static void main(String[] args) {
        int n = 5;
       
        for(int i = 1; i <= n;i++){
           for(int j = 1;j <= n-i;j++){
            System.out.print(" ");
           
           }
           char a = 'A';
           int b = (2*i -1)/2;
           for(int j = 1;j <= 2*i -1;j++){
            System.out.print(a);
  
           if(j <= b){
            a++;
           }
           else{
            a--;
           }
           }
           for(int j = 1;j <= n-i;j++){
            System.out.print(" ");
        
           }
           System.out.println();
        }
    }
}
