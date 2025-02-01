package interviewbit;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,7,8};
        int target=5;
        System.out.println("Target --> "+search(arr,target));
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
