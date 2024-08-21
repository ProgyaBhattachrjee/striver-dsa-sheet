package greedyalgo;

import java.util.Arrays;

public class railway {
    public static void find(double[] arr, double[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platformsNeeded = 0;
        int maxPlatforms = 0;

        while (i < arr.length && j < dep.length) {
            if (arr[i] < dep[j]) {
                platformsNeeded++;
                i++;
                    maxPlatforms = Math.max(platformsNeeded, maxPlatforms);
                
            } else {
                platformsNeeded--;
                j++;
            }
        }
        System.out.println("Minimum number of platforms required: " + maxPlatforms);
    }

    public static void main(String[] args) {
        double[] arr = {9.00,9.45,9.55,11.00,15.00,18.06};
        double[] dep = {9.20,12.00,11.30,11.50,19.00,20.00};
        find(arr, dep);
    }
}
