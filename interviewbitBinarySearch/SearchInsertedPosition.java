package interviewbitBinarySearch;

import java.util.ArrayList;

public class SearchInsertedPosition {
    public int searchInsert(ArrayList<Integer> arr, int target) {
        int start=0;
        int end=arr.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }else if (arr.get(mid)>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
}
