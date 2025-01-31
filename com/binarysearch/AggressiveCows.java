package com.binarysearch;

import java.util.Arrays;

public class AggressiveCows {
    public static int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int start = 1;
        int res = -1;
        int end = stalls[stalls.length - 1] - stalls[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isCowPlacedPossible(stalls, cows, mid)) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    private static boolean isCowPlacedPossible(int[] stalls, int cows, int mid) {
        int cowCnt = 1;
        int lastPlaced = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= mid) {
                cowCnt++;
                lastPlaced = stalls[i];
                if (cows == cowCnt) {
                    return true;
                }
            }
        }
        return false;
    }
}
