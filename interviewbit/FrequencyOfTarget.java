package interviewbit;

public class FrequencyOfTarget {
    public static void main(String[] args) {

    }

    public int getOccurrenceOfTarget(int[] arr, int target, boolean firstOccurrence, boolean lastOccurrence) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; // Store possible answer
                if (firstOccurrence) {
                    end = mid - 1; // Continue searching in left half
                } else { // lastOccurrence must be true
                    start = mid + 1; // Continue searching in right half
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
