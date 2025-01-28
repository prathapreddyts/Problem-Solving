package com.binarysearch;

public class BinarySearchLC704 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = ((end - start) / 2) + start; // Calculate mid
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return -1; // Target not found
    }

}
