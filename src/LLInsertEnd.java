package extra;
import java.util.*;
public class LLInsertEnd {
	Node head;
	Node tail;
	
	private void insertEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	
	private void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		
		System.out.print("End");
	
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
		LLInsertEnd li = new LLInsertEnd();
		li.insertEnd(1);
		li.insertEnd(2);
		li.insertEnd(3);
		li.insertEnd(4);
		
		li.display();
	}

}






 
 
 
 
 
 
 
