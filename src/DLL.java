package extra;
import java.util.*;
public class DLL {
	Node head;
	
	public void insertBeg(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void insertEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while(temp.next!=null && temp!=null) {
				temp = temp.next;
			} if (temp == null) {
				System.out.println("Out of bounds");
			} else {
				temp.next = newNode;
				newNode.prev = temp;
			}
		}
	}
	
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes:");
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		for(int i = 0; i<n; i++) {
			int value = sc.nextInt();
			insertEnd(value);
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+ " -> ");
			temp = temp.next;
		}
		System.out.print("End");
	}
	
	private class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
    public static void main(String[] args) {
		DLL list = new DLL();
		list.userInput();
		list.display();
		}


}
