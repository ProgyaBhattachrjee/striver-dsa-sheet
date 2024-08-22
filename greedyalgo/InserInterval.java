package greedyalgo;

import java.util.ArrayList;
import java.util.Arrays;

public class InserInterval {
    public static void main(String[] args) {
        
    ArrayList<int[]> intervals = new ArrayList<>();
    intervals.add(new int[]{1, 3});
    intervals.add(new int[]{2, 6});
    intervals.add(new int[]{8, 10});
    intervals.add(new int[]{15, 18});
    intervals.sort((a, b) -> Integer.compare(a[0], b[0]));
    ArrayList<int[]> merged = new ArrayList<>();
    int[] current = intervals.get(0);
    merged.add(current);

    for (int[] interval : intervals) {
        int currentEnd = current[1];
        int nextStart = interval[0];
        int nextEnd = interval[1];
        if (currentEnd >= nextStart) {
            current[1] = Math.max(currentEnd, nextEnd);
        } else {
            current = interval;
            merged.add(current);
        }
    }

    for (int[] interval : merged) {
        System.out.print(Arrays.toString(interval));
    }
}
    }
