package com.binarysearch;

public class MedianOfSortedArrays {
    public double median(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedian(nums2, nums1);
        }
        return findMedian(nums1, nums2);
    }

    public double findMedian(int[] arr1, int[] arr2) {
        int low = 0;
        int high = arr1.length;
        int totalLength = arr1.length + arr2.length;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = (totalLength + 1) / 2 - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int r1 = (mid1 == arr1.length) ? Integer.MAX_VALUE : arr1[mid1];

            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
            int r2 = (mid2 == arr2.length) ? Integer.MAX_VALUE : arr2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if (totalLength % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0; // Ensure double division
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return -1;
    }
}
