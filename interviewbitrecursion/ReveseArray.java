package interviewbitrecursion;

import java.util.Arrays;

public class ReveseArray {
    public static void main(String[] args) {
        int[] inp={1,2,3,4,5,6};
        int[] ints = reverseList(inp, 0, inp.length - 1);
        System.out.println(Arrays.toString(ints));
    }
    public static int[]reverseList(int[]list,int start,int end){
        if(start>=end){
            return list;
        }
        int temp=list[start];
        list[start]=list[end];
        list[end]=temp;
        return reverseList(list,start+1,end-1);
    }
}
