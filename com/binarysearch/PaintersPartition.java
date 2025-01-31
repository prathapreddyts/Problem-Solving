package com.binarysearch;

public class PaintersPartition {
    public int paintWalls(int[] paintBoards, int painters, int paintingUnitTime) {
        int res = -1;
        int start = Integer.MAX_VALUE;
        int end = 0;
        for (int paintBoard : paintBoards) {
            start = Math.min(start, paintBoard);
            end += paintBoard;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(isPossible(paintBoards,mid,painters)){
                    res=mid;
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return res*paintingUnitTime;
    }
    public boolean isPossible(int[] paintBoards,int midValue,int painterCount){
        int painters=0;
        int painterBoardAllocation = 0;
        for(int i=0;i<paintBoards.length;i++){
            if(paintBoards[i]>midValue){
                return false;
            }
            if(painterBoardAllocation+paintBoards[i]<=midValue){
                painterBoardAllocation+=paintBoards[i];
            }else{
                painters++;
                if(painters>painterCount){
                    return false;
                }
                painterBoardAllocation=paintBoards[i];
            }
        }
        return false;
    }
}
