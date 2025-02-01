package interviewbit;

import java.util.ArrayList;

public class PivotElement {
    public int searchPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int solve(ArrayList<Integer> A) {
        if (A.size() == 1) {
            return A.get(0);
        }
        int low = 0;
        int high = A.size() - 1;

        if (A.get(low) > A.get(low + 1))
            return A.get(low);

        else if (A.get(high) > A.get(high - 1)) {
            return A.get(high);
        } else {

            while (low < high) {
                int mid = low + (high - low) / 2;
                Integer midValue = A.get(mid);
                Integer leftValue = A.get(mid - 1);
                Integer rightValue = A.get(mid + 1);
                if (midValue > leftValue && midValue > rightValue) {
                    return midValue;
                } else if (midValue >= leftValue && midValue <= rightValue)
                    low = mid + 1;

                else
                    high = mid - 1;

            }
            return A.get(low);
        }
    }
}
