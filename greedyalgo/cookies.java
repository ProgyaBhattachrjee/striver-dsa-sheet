
package greedyalgo;

import java.util.Arrays;

public class cookies {

    public static int find(int[] c,int[] g){
     int r = 0;
     int l = 0;
     Arrays.sort(c);
     Arrays.sort(g);
     
     while (r < g.length && l < c.length) {
        if(g[r] <= c[l]){
            r++;
        }
        l++;
     }
     return r;

    }
    public static void main(String[] args) {
        int[] cookies = {4, 2, 1, 2, 1, 3};
        int[] greed = {1,5,3,3,4};
        int find = find(cookies, greed);
        System.out.println(find);
    }
    
}