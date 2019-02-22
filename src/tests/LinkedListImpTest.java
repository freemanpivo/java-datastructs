package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import linkedlist.LinkedListImp;

class LinkedListImpTest {

	private LinkedListImp ll = new LinkedListImp();
		
	@Test
	void testEmptyLinkedList() {
		
		assertTrue(ll.isEmpty());
		
	}
	
	@Test
	void testInsertNode() {
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		
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
		int position = 0;
		int data = 1000;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
	}
	
	@Test
	void testInsertAtPositionEnd() {
		String expected = "atEnd";
		
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		
		int position = 2;
		int data = 4;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
	}
	
	@Test
	void testInsertAtPositionMiddle() {
		String expected = "atMiddle";
		
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		
		int position = 1;
		int data = 4;
		
		assertEquals(expected, ll.insertAtPosition(position, data));
	}
}
