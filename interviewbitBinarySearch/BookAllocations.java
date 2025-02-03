package interviewbitBinarySearch;

import java.util.ArrayList;

public class BookAllocations {
    public int books(ArrayList<Integer> arr, int students) {
        if(arr.size()<students){
            return -1;
        }
        int start=0;
        int end=arr.size();
        for(int bookPages:arr){
            start=Math.max(start,bookPages);
            end+=bookPages;
        }
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBooksAllocationPossible(arr,students,mid)){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public boolean isBooksAllocationPossible(ArrayList<Integer> arr, int students,int minPages){
        int pages=0;
        int studentCount=1;
        for(int i=0;i<arr.size();i++){
            if(pages+arr.get(i)<=minPages){
                pages+=arr.get(i);
            }else{
                studentCount++;
                if(studentCount>students){
                    return false;
                }
                pages=arr.get(i);
            }
        }
        return true;
    }
}
