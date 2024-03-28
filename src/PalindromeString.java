package progs;
import java.util.*;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		String org_str = str;
		/*String rev = "";
		int len = str.length();
				for(int i = len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
			
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is a palindrome");
		}else {
			System.out.println(org_str+" is not a palindrome");
		}*/
		 char[] charArray = str.toCharArray();
		 int start = 0;
	     int end = charArray.length - 1;
	    /* while (start < end) {
	    	 char temp = charArray[start];
	    	 charArray[start] = charArray[end];
	    	 charArray[end] = temp;
	    	 start++;
	    	 end--;
	     }
	     String rev = new String(charArray);
	     if(org_str.equals(rev)) {
				System.out.println(org_str+" is a palindrome");
			}else {
				System.out.println(org_str+" is not a palindrome");
			}*/
	     
	     while (start < end) {
				if (charArray[start] != charArray[end]) {
					System.out.println(org_str + " is not a palindrome");
					return; 
				}
				start++;
				end--;
			}

			System.out.println(org_str + " is a palindrome");
		}
	}
	     
	


