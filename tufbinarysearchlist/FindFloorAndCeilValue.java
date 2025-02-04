package tufbinarysearchlist;

public class FindFloorAndCeilValue {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = getFloor(nums, x);
        int ceil = getCeil(nums, x);
        int[] result = {floor, ceil};
        return result;

    }

    public static int getFloor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int floor = -1; // Initialize the floor as -1 to handle cases where no floor exists

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // If target is found, it's the floor itself
            } else if (nums[mid] < target) {
                floor = nums[mid]; // Update floor since nums[mid] is less than target
                start = mid + 1;  // Move to the right half
            } else {
                end = mid - 1; // Move to the left half
            }
        }

        return floor;
    }

    public int getCeil(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ceil = -1; // Initialize the floor as -1 to handle cases where no floor exists

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // If target is found, it's the floor itself
            } else if (nums[mid] < target) {

                start = mid + 1;  // Move to the right half
            } else {
                ceil = nums[mid]; // Update ceil since nums[mid] is greater than target
                end = mid - 1; // Move to the left half
            }
        }

        return ceil;
    }

    public int floorValue(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = ((end - start) / 2) + start; // Calculate mid
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return end; // Target not found
    }

    public int ceilValue(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = ((end - start) / 2) + start; // Calculate mid
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return start; // Target not found
    }


}
