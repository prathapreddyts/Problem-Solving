package interviewbitBinarySearch;

public class GreatestElementLessThanTarget {
    public static void main(String[] args) {

    }
    public int greaterElementLessThanTarget(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                ans=mid;//Possible answer,store it and check is there any other possible answer
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
