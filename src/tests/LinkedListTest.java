package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import types.LinkedListImp;

class LinkedListTest {

	@Test
	void testExample() {
		LinkedListImp ll = new LinkedListImp();
		
		ll.setNumber(1);
		
		assertEquals(1, ll.getNumber());
	}

}
