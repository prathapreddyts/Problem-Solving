package interviewbitBinarySearch;

import java.util.ArrayList;

public class SmallerOrEqualElements {
    public int solve(ArrayList<Integer> arr, int target) {
        if (arr.size() == 1) {
            return 0;
        }
        int result = 0;
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //It will be possible greater element and go to right side check is there any possible answer
            if (arr.get(mid) <= target) {
                result = mid;
                start = mid + 1;
            }
            //It will be possible greater element and go to left side check is there any possible ans somewhere else
            {
                end = mid - 1;
            }
        }
        return result + 1;
    }
}
