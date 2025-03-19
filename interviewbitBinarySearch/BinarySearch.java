package interviewbitBinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int target=5;
        print(arr,0,arr.length);
    }

    public static void print(int[] arr,int left,int right){
         left=0;
         right=arr.length-1;
         int leftvalue=0;
         int rightvalue=0;
         while(left<=right){
             System.out.println("left index - "+left+" "+"right idx - "+right);
             System.out.println("leftvalue ---> "+leftvalue+"  rightvalue ---> "+rightvalue);
             left++;
             right--;
             leftvalue=arr[left];
             rightvalue=arr[right];

         }
        System.out.println("leftvalue ---> "+leftvalue);
        System.out.println("rightvalue ---> "+rightvalue);


    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
