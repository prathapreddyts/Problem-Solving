package interviewbitrecursion;

import java.util.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] inp={1,2,3,7,5,6};
        System.out.println("Result ---> "+isArraySorted(inp, 0));
    }
    public static boolean isArraySorted(int[]arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<=arr[idx+1]&&isArraySorted(arr,idx+1);
    }
}
