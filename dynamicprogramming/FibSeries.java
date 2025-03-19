package dynamicprogramming;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println(fibSeries(6));
        System.out.println(dpFibSeries(6));
        System.out.println(dpFibSeriesTabulation(6));
        System.out.println(fibonacciSeriesOptimised(6));
    }

    public static int fibonacciSeriesOptimised(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibSeries(n - 1) + fibSeries(n - 2);
    }

    public static int dpFibSeries(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        if (n <= 1) {
            dp[n] = n;
            return dp[n];
        }
        if (dp[n] == -1) {
            dp[n] = dpFibSeries(n - 1) + dpFibSeries(n - 2);
        }
        return dp[n];
    }

    public static int dpFibSeriesTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
