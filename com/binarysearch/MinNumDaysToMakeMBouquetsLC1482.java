package com.binarysearch;

public class MinNumDaysToMakeMBouquetsLC1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > n)
            return -1; // Not enough flowers

        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                right = mid; // Try a smaller day
            } else {
                left = mid + 1; // Increase the days
            }
        }
        return left;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay)
        {
            if (bloom <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; // Reset count
                }
            } else {
                flowers = 0; // Reset since flowers must be adjacent
            }
            if (bouquets >= m)
                return true;
        }
        return false;
    }
}
