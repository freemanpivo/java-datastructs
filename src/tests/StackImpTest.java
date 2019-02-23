package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stack.EmptyStackImpException;
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
		System.out.println("PUSH 3 ELEMENTS: ");
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
		
		System.out.println("PUSH 5 ELEMENTS: ");
		stack.show();
		System.out.println();
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			stack.push(6);
		});
	}
	
	@Test
	void testPopEmptyStack() {
		System.out.println("POP EMPTY: ");
		stack.show();
		System.out.println();
		
		assertThrows(EmptyStackImpException.class, () -> {
			stack.pop();
		});
		System.out.println("---");
	}
	
	@Test
	void testPopElement() throws EmptyStackImpException {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.pop();
		
		System.out.println("POP: ");
		stack.show();
		System.out.println();
		
		assertEquals(4, stack.size());
	}
	
	@Test
	void testPeekFirstElement() {
		
		assertEquals(0, stack.peek());
	}
	
	@Test
	void testPeekMiddleElement() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(3, stack.peek());
	}
	
	@Test
	void testPeekElementWithFullStack() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		assertEquals(5, stack.peek());
	}
}
