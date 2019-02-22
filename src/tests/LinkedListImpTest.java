package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import linkedlist.LinkedListImp;

class LinkedListImpTest {

	LinkedListImp ll = new LinkedListImp();
		
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
	
}
