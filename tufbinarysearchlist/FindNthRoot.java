package tufbinarysearchlist;

public class FindNthRoot {

    public int NthRoot(int N, int M) {
        int low = 1, high = M;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, N, M);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    private int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
}
