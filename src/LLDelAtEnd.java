package extra;
import java.util.*;
public class LLDelAtEnd {
	Node head;
	
	public void insert(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		} else { 
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void userInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		for(int i = 0; i < n; i++ ) {
			int values = sc.nextInt();
			insert(values);
		}
		
	}
	
	
	public void DelAtEnd() {
		if(head == null || head.next == null) {
			head = null;
			return;
		} else {
			Node temp = head;
			Node prev = null;
			while(temp.next!=null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
	}
	
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.print("End");
		System.out.println();
	}
	
	private class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		LLDelAtEnd list = new LLDelAtEnd();
		list.userInput();
		System.out.print("Original list : ");
		list.display();
		list.DelAtEnd();
		System.out.print("After deletion : ");
		list.display();
	}

}



