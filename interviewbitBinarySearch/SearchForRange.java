package interviewbitBinarySearch;

import java.util.*;

public class SearchForRange {
    public ArrayList<Integer> searchRange(final List<Integer> arr, int target) {
        ArrayList<Integer> result=new ArrayList<>(2);
        result.add(searchLeftOccur(arr,target));
        result.add(searchRightOccur(arr,target));
        return result;
    }
    public int searchLeftOccur(final List<Integer> arr, int target) {
        ArrayList<Integer>result=new ArrayList<>();
        int start=0;
        int ans=-1;
        int end=arr.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr.get(mid)<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public int searchRightOccur(final List<Integer> arr, int target) {
        ArrayList<Integer>result=new ArrayList<>();
        int start=0;
        int ans=-1;
        int end=arr.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr.get(mid)<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
