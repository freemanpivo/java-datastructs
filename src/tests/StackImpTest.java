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
	
	@Test
	void testPushThreeElements() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
	
		assertEquals(3, stack.size());
		stack.show();
		System.out.println();
	}
	
	@Test
	void testStackOverFlow() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.show();
		System.out.println();
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			stack.push(6);
		});
	}
}
