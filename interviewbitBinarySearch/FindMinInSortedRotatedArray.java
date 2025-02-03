package interviewbitBinarySearch;

import java.util.List;

public class FindMinInSortedRotatedArray {
    public int findMin(final List<Integer> arr) {
        int minValue=Integer.MAX_VALUE;
        int start=0;
        int end=arr.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //If array is sorted
            if (arr.get(start) <= arr.get(end)) {
                return start;
            }
            //if mid-1 value is greater than next value then midvalue will be the min value
            if(mid>0 && arr.get(mid-1)>arr.get(mid)){
                return arr.get(mid);
            }
            //if array is sorted start to midvalue then value will be in next half
            if(arr.get(start)<=arr.get(mid)){
                minValue=Math.min(minValue,arr.get(start));
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return minValue;
    }
}
