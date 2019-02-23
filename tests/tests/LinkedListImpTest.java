package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import linkedlist.LinkedListImp;

class LinkedListImpTest {

	private LinkedListImp ll = new LinkedListImp();
		
	private void setupLinkedList() {
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
	}
	
	@Test
	void testEmptyLinkedList() {
		
		assertTrue(ll.isEmpty());
		
	}
	
	@Test
	void testInsertNode() {
		setupLinkedList();
		
		assertEquals(3, ll.length());
	}

	
	
	@Test
	void testInsertAtStart3times() {
		ll.insertAtStart(1);
		ll.insertAtStart(2);
		ll.insertAtStart(3);
		
		assertEquals(3, ll.length());
	}
	
	@Test
	void testInsertAtPositionStart() {
		String expected = "atStart";
		
		setupLinkedList();
		
		int position = 0;
		int data = 1000;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
		assertEquals(4, ll.length());
		
		System.out.println("Insert - Start");
		ll.show();
		System.out.println();
	}
	
	@Test
	void testInsertAtPositionEnd() {
		String expected = "atEnd";
		
		setupLinkedList();
		
		int position = 2;
		int data = 1000;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
		assertEquals(4, ll.length());
		
		System.out.println("Insert - End");
		ll.show();
		System.out.println();
	}
	
	@Test
	void testInsertAtPositionMiddle() {
		String expected = "atMiddle";
		
		setupLinkedList();
		
		int position = 1;
		int data = 1000;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
		assertEquals(4, ll.length());
		
		System.out.println("Insert - Middle");
		ll.show();
		System.out.println();
	}
	
	@Test
	void testDeleteAtPositionStart() {
		String expected = "atStart";
		
		setupLinkedList();
		int position = 0;
		
		assertEquals(expected, ll.deleteAtPosition(position));
		assertEquals(2, ll.length());
		
		System.out.println("Delete - Start");
		ll.show();
		System.out.println();
	}
	
	@Test
	void testDeleteAtPositionEnd() {
		String expected = "atEnd";
		
		setupLinkedList();
		int position = 2;
		
		assertEquals(expected, ll.deleteAtPosition(position));
		assertEquals(2, ll.length());
		
		System.out.println("Delete - End");
		ll.show();
		System.out.println();
	}
	
	@Test
	void testDeleteAtPositionMiddle() {
		String expected = "atMiddle";
		
		setupLinkedList();
		int position = 1;
		
		assertEquals(expected, ll.deleteAtPosition(position));
		assertEquals(2, ll.length());
		
		System.out.println("Delete - Middle");
		ll.show();
		System.out.println();
	}
}
