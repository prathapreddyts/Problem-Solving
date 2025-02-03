package interviewbitBinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,7,8};
        int target=7;
        System.out.println("Target --> "+search(arr,target,0,arr.length-1));
    }
    public static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+((end-start)/2);
        if(arr[mid]==target){
            return arr[mid];
        }
        else if(arr[mid]<target){
            return search(arr,target,mid+1,end);
        }else{
            return search(arr,target,start,mid-1);
        }
    }
}
