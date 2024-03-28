package progs;
import java.util.Scanner;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1}; // Example of a rotated sorted array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be searched:");
        int item = input.nextInt();
        System.out.println("The position of the number: " + binarySearch(nums, item));
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // If the right half is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
