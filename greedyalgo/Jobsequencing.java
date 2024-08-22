package greedyalgo;

import java.lang.reflect.Array;
import java.util.Arrays;

class Job{
    int id,deadline,profit;
    Job(int id,int deadline,int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class Jobsequencing {
    public static void find(Job[] arr,int n){
        Arrays.sort(arr,(a,b) -> b.profit - a.profit);
    
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i].deadline > max){
                max = arr[i].deadline;
            }
        }
        int[] res = new int[max+1];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
     
        int profit = 0,jobs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if(res[j] == -1){
                    res[j] = i;
                    jobs++;
                    profit+= arr[i].profit;
                    break;
                }
            }
        }
        System.out.println("[ "+jobs+","+profit+" ]");
    }

    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
              find(arr, arr.length);
    }
}