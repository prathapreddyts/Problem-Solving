package com.binarysearch;

import java.util.List;

public class GasStationDistance {
    public static double minimiseMaxDistance(int[] stations, int K) {
        int n = stations.length;
        double l = 0;
        double h = stations[n - 1] - stations[0];
        double ans = 0.0;

        while (h - l > 1e-7) {  // Use a precision threshold instead of l <= h
            double mid = (l + h) / 2.0;
            if (check(stations, K, mid)) {
                h = mid;
                ans = mid;
            } else {
                l = mid;
            }
        }
        return Math.round(ans * 100000) / 100000.0; // Round to 5 decimal places
    }

    private static boolean check(int[] stations, int K, double ans) {
        int cnt = 0;
        for (int i = 1; i < stations.length; i++) {
            double diff = stations[i] - stations[i - 1];
            if (diff > ans) {
                cnt += (int) (diff / ans);
            }
        }
        return cnt <= K;
    }

    private int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }

            cnt += numberInBetween;
        }
        return cnt;
    }

    public double minimiseMaxDistanceStriverEdition(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        double diff = 1e-6;
        while (high - low > diff) {
            double mid = (low + high) / 2.0;
            int cnt = numberOfGasStationsRequired(mid, arr);
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }
}
