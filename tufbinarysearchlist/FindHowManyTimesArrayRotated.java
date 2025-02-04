package tufbinarysearchlist;

import java.util.*;

public class FindHowManyTimesArrayRotated {
    public int findKRotation(ArrayList<Integer> nums) {
        return findMin(nums);
    }
    public int findMin(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(start) <= arr.get(end)) {
                return start;
            }
            if (mid > 0 && arr.get(mid) < arr.get(mid - 1)) {
                return mid;
            }
            if (arr.get(start) <= arr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
