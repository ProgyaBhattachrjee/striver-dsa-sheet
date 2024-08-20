package greedyalgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nmeeting {
    
    public static void calculate(int[] s, int[] e,int n) {
        List<int[]> activities = new ArrayList<>();
        int[] ans = new int[n];
        for (int i = 0; i < e.length; i++) {
            activities.add(new int[]{e[i], s[i], i + 1});
        }
        Collections.sort(activities, (a, b) -> a[0] - b[0]);
        System.out.print(activities.get(0)[2] + " ");
        int lastEndTime = activities.get(0)[0];
        for (int i = 1; i < activities.size(); i++) {
            if (activities.get(i)[1] >= lastEndTime) {
                System.out.print(activities.get(i)[2] + " ");
                lastEndTime = activities.get(i)[0];
            }
        }
    }
    public static void main(String[] args) {
        int[] s = {1,3,0,5,8,5};
        int[] e = {2,4,5,7,9,9};
        System.out.println("meeting numbers: ");
        calculate(s, e,4);
    }
}
