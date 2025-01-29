package com.binarysearch;

import java.util.Arrays;

public class KokoEatingBananasLC875 {
    public int minimumRateToEatBananas(int[] piles, int h) {
        int left = 1; // Minimum possible speed
        int right = Arrays.stream(piles).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            int totalTime = 0;

            // Calculate total time required for the current speed
            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / mid); // Equivalent to ceil(pile / mid)
            }
            if (totalTime <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
