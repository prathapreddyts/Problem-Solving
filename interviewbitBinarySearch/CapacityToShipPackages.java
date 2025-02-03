package interviewbitBinarySearch;

import java.util.*;

public class CapacityToShipPackages {
    private boolean canShip(ArrayList<Integer> A, int days, int capacity) {
        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : A) {
            if (currentWeight + weight > capacity)
            {
                requiredDays++;
                currentWeight = weight;
                if (requiredDays > days) {
                    return false;
                }
            } else {
                currentWeight += weight;
            }
        }
        return true;
    }

    // Method to find the minimum capacity needed
    public int solve(ArrayList<Integer> A, int B) {
        int low = Collections.max(A);
        int high = A.stream().mapToInt(Integer::intValue).sum();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(A, B, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
