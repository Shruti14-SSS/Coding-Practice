package progs;
import java.util.*;
public class search {
	public static void main(String[] args) {
		int a[] = new int[5]; int count=0;int j=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array:");
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
			System.out.print(a[i]+" ");
		}
		Scanner r= new Scanner(System.in);
		System.out.println("\nEnter the element to be searched:");
		int n = r.nextInt();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==n) {
				count++;
				j=i;
				break;
			}
		}
		if(count>0) {
			System.out.println("Element found at "+j+" position");
			
		}
		else {
			System.out.println("Element not found");
		}
		
	}

}
