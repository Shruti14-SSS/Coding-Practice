package extra;
import java.util.*;
public class CeilingOfANumber {
    public void searchInsert(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        target = sc.nextInt();
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int midPos = (end-start)/2;
            int midEle = nums[midPos];
            if(midEle == target){
                System.out.println("Target element found at pos"+midPos);
            }
            if(midEle > target){
                end = midPos - 1;
            } else {
                start = midPos + 1;
            }
        }
        System.out.println("Target elements could have been inserted at position:"+start);

    }
}