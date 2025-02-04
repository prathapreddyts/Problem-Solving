package interviewbitBinarySearch;

import java.util.*;

import java.util.*;

public class MedianSortedArrays {
    public double findMedianSortedArrays(final List<Integer> arr1, final List<Integer> arr2) {
        // Ensure arr1 is the smaller array
        if (arr1.size() > arr2.size()) {
            return findMedian(arr2, arr1);
        }
        return findMedian(arr1, arr2);
    }

    private double findMedian(final List<Integer> arr1, final List<Integer> arr2) {
        int n1 = arr1.size();
        int n2 = arr2.size();
        int start = 0, end = n1;
        int totalLen = n1 + n2;

        while (start <= end) {
            int mid1 = start + (end - start) / 2;
            int mid2 = (totalLen + 1) / 2 - mid1; // Ensure left partition sizes sum to half

            // Handling edge cases for partitioning
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1.get(mid1 - 1);
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1.get(mid1);
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2.get(mid2 - 1);
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2.get(mid2);

            if (l1 <= r2 && l2 <= r1) {
                // Even length case
                if (totalLen % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else { // Odd length case
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                end = mid1 - 1; // Reduce right half
            } else {
                start = mid1 + 1; // Increase left half
            }
        }
        return -1; // Should never reach here
    }

}

