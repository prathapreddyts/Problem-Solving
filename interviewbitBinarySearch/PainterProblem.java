package interviewbitBinarySearch;

import java.util.*;

import java.util.*;

public class PainterProblem {
    private static final int MOD = 10000003;

    public int paint(int A, int B, ArrayList<Integer> C) {
        int start = Collections.max(C); // Minimum possible time (max board size)
        int end = C.stream().mapToInt(Integer::intValue).sum(); // Maximum possible time (sum of all boards)
        int res = end; // Store the minimum time found

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, C, mid)) { // Check if 'mid' time is feasible
                res = mid;
                end = mid - 1; // Try to minimize further
            } else {
                start = mid + 1; // Increase time
            }
        }
        return (int) ((long) res * B % MOD); // Multiply by B and take mod
    }

    private boolean isPossible(int painters, ArrayList<Integer> boards, int maxTime) {
        int count = 1, total = 0;
        for (int board : boards) {
            if (total + board <= maxTime) {
                total += board; // Add to current painter's workload
            } else {
                count++; // Allocate new painter
                if (count > painters) return false; // More painters needed than available
                total = board; // Reset workload for new painter
            }
        }
        return true; // Possible to paint within 'maxTime'
    }

}
