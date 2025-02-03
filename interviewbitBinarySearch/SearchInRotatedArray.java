package interviewbitBinarySearch;

import java.util.List;

public class SearchInRotatedArray {
    public int search(final List<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }
            if (arr.get(start) <= arr.get(mid)) {
                if (arr.get(start) <= target && target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr.get(mid) < target && target <= arr.get(end)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
