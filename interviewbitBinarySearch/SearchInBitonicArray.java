package interviewbitBinarySearch;

import java.util.List;

public class SearchInBitonicArray {
    public int solve(List<Integer> A, int B) {
        int l = 0;
        int n = A.size();
        int h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (A.get(mid) == B) {
                return mid;
            }

            if (mid > 0 && mid + 1 < n && A.get(mid - 1) < A.get(mid) && A.get(mid) < A.get(mid + 1)) {
                if (A.get(mid) < B) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else if (mid > 0 && mid + 1 < n && A.get(mid - 1) > A.get(mid) && A.get(mid) > A.get(mid + 1)) {
                if (A.get(mid) > B) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else {
                if (A.get(mid) < B) {
                    return -1;
                }
            }
        }
        return -1;
    }

}
