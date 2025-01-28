package com.binarysearch;

import java.util.ArrayList;

public class MinValueInSortedAndRotatedArray {
    public int findMin(ArrayList<Integer> arr) {
        int start=0;
        int ans=Integer.MAX_VALUE;
        int end=arr.size()-1;
        while(start<=end){
            int mid=((end-start)/2)+start;
            if(arr.get(start)<=arr.get(mid)){
                ans=Math.min(arr.get(start),ans);
                start=mid+1;
            }else{
                ans = Math.min(ans, arr.get(mid));
                end=mid-1;
            }
        }
        return ans;
    }
    public int findMinValue(ArrayList<Integer> arr) {
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
