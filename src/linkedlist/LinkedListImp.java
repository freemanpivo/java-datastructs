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
	
	public String insertAtPosition(int position, int data) {
		Node current = new Node();
		current.data = data;
		current.next = null;
		
		Node iterator = new Node();
		iterator = head;
		
		if (position == 0) {
			insertAtStart(data);
			return "atStart";
		}
		else if (position == (length() - 1)) {
			insert(data);
			return "atEnd";
		}
		else {
			for (int i=0; i<position-1;i++) {
				iterator = iterator.next;
			}
			current.next = iterator.next;
			iterator.next = current;
			return "atMiddle";
		}
			
	}
	
	public String deleteAtPosition(int position) {
		
		if (position == 0) {
			head = head.next;
			return "atStart";
			
		} else if (position == (length() - 1)){
			Node iterator = head;
			
			for (int i=0;i<position-1;i++) {
				iterator = iterator.next;
			}
			
			iterator.next = null;
			return "atEnd";
			
		} else {
			Node iterator = head;
			Node aux = null;
			
			for (int i=0;i<position-1;i++) {
				iterator = iterator.next;
			}
			aux = iterator.next;
			iterator.next = aux.next;
			aux = null;
			
			return "atMiddle";
		}
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
