package com.binarysearch;

public class FirstAndLastPositionLC34 {
    public int[] searchRange(int[] nums, int target) {
        int[] results = new int[2];
        results[0] = getFistOccurance(nums, target); // First occurrence
        results[1] = getLastOccurance(nums, target); // Last occurrence
        return results;
    }

    // Method to find the first occurrence (floor)
    public int getFistOccurance(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // Default to -1 if not found
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid; // Update answer
                end = mid - 1; // Search on the left side for the first occurrence
            } else if (nums[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return ans;
    }

    // Method to find the last occurrence (ceil)
    public int getLastOccurance(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid; // Update answer
                start = mid + 1; // Search on the right side for the last occurrence
            } else if (nums[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return ans;
    }

}
