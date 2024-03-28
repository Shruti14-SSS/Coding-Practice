package progs;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	/*int num , array, counter,item;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
    num = input.nextInt();
	
	array = new int[num];
	System.out.println("Enter the elements:");
	for(counter = 0; counter<num; counter++)
		array[counter] = input.nextInt();
	System.out.println("Enter the item to be searched:");
	item = input.nextInt();
    System.out.println(BinarySearch(array[], item));*/
	int[] nums = {1,2,3,4,5};
	System.out.println("The position of the number:"+BinarySearch(nums,-1));
}
private static int BinarySearch(int[] numbers, int numberToBeFound) {
	int low = 0;
	int high = numbers.length - 1;
	while(low<=high) {
	int	middlePosition = (low+high)/2;
	int middleNumber = numbers[middlePosition];
	if (numberToBeFound == middleNumber) {
		return middlePosition;
	}if(numberToBeFound < middleNumber) {
		high = middlePosition - 1;
	}else {
		low = middlePosition + 1;
	}
		
	}
	return -1;
	
}
}
