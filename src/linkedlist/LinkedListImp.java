package linkedlist;

public class LinkedListImp {
	
	Node head;
	
	public void insert(int data) {
		Node current = new Node();
		current.data = data;
		current.next = null;
		
		if (head == null)
			head = current;
		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = current;
		}
	}
	
	public void insertAtStart(int data) {
		Node current = new Node();
		current.data = data;
		current.next = head;
		
		head = current;
	}
	
	public void show() {
		Node node = head;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		// print last element
		System.out.print(node.data);
	}
	
	public int length() {
		int length = 0;
		Node current = head;
		
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	public boolean isEmpty() {
		return (length() == 0);
	}
}
