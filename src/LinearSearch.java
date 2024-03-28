package progs;
import java.util.*;
public class LinearSearch {
	private static void LS(int[] arr, int ele) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println(ele+" found at index "+i);
				return;
			}
			if(arr[i]!=ele) {
				System.out.println("Element not found");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int ele = sc.nextInt();
		LS(arr,ele);
		sc.close();
	}

}



