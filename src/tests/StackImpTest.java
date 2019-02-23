package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stack.StackImp;

class StackImpTest {
	
	private StackImp stack = new StackImp();
	
	@Test
	void testIfStackIsEmpty() {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	void testIfStackHasNoElements() {
		assertEquals(0, stack.size());
	}

}
