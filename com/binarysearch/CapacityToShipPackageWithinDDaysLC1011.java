package com.binarysearch;

public class CapacityToShipPackageWithinDDaysLC1011 {

    public int shipWithinDays(int[] weights, int D) {
        int left = getMaxWeight(weights); // Minimum possible capacity
        int right = getTotalWeight(weights); // Maximum possible capacity

        // Binary search to find the minimum feasible capacity
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            if (canShipWithinDays(weights, mid, D)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private int getMaxWeight(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            max = Math.max(max, weight);
        }
        return max;
    }
    private int getTotalWeight(int[] weights) {
        int total = 0;
        for (int weight : weights) {
            total += weight;
        }
        return total;
    }
    private boolean canShipWithinDays(int[] weights, int capacity, int D) {
        int days = 1;
        int currentWeight = 0;
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                days++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        return days <= D;
    }
}


