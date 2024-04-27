package extra;
import java.util.*;
public class BubbleSort {
	private static void bubblesort(int arr[]) {
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
			for(int j = 0; j<len-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	private static void printArray(int arr[]) {
		int len = arr.length;
		for(int i = 0; i<len; i++)
			System.out.println(arr[i]+ " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n = s.nextInt();
		System.out.println("Enter the array:");
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
	bubblesort(arr);
	System.out.println("Sorted array:");
	printArray(arr);
	}

}
