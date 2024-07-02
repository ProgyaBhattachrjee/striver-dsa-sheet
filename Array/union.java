package Array;

import java.util.Arrays;
import java.util.HashSet;

public class union {
static int[] unions(int[] a,int[] b){
HashSet<Integer> n = new HashSet<>();
for(int s: a){
    n.add(s);
}
for(int s: b){
    n.add(s);
}
int[] r = new int[n.size()];
int i = 0;
for(int s: n){
    r[i++] = s;
}
return r;
}
    public static void main(String[] args) {
        int[] a = unions(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 4, 5});
        System.out.println(Arrays.toString(a));
    }
}
