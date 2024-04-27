package extra;
import java.util.*;
public class BinSearch {
	private static void BS(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid_pos = (start+end)/2;
			int mid_ele = arr[mid_pos];
			if(mid_ele == item) {
				System.out.println(item+" found at "+mid_pos);
				return;
				} if(item < mid_ele) {
					start = 0;
					end = mid_ele - 1;
					} if(item > mid_ele) {
						start = mid_ele + 1;
						end = arr.length -1;
					}
				}		
		
		
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements:");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("enter the array:");
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
				}
			System.out.println("Enter the item to be searched:");
			int item = sc.nextInt();
			BS(arr,item);
		}

}

