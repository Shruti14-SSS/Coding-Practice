package extra;
import java.util.*;

class LLInsertBeginning { 
	 Node head;
	 
	
	private void insertBeginning(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
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
		LLInsertBeginning list = new LLInsertBeginning();
		list.insertBeginning(1);
		list.insertBeginning(2);
		list.insertBeginning(3);
		list.insertBeginning(4);
		
		list.display();
		
	}
}

    