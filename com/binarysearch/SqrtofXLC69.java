package com.binarysearch;

public class SqrtofXLC69 {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid <= x/mid){//to avoid storage capacity problem
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}
