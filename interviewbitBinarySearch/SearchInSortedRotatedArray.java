package interviewbitBinarySearch;

import java.util.*;

public class SearchInSortedRotatedArray {
    public int search(final List<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr.get(start) <= arr.get(mid)) {
                // Target lies within the sorted left half
                if (arr.get(start) <= target && target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half must be sorted
            else {
                // Target lies within the sorted right half
                if (arr.get(mid) < target && target <= arr.get(end)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

}
