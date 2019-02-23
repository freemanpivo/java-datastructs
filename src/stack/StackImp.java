package stack;

public class StackImp {

	private static final int STACK_SIZE = 5;
	private int lastElementPosition = 0;
	private int stack[] = new int[STACK_SIZE];
	
	public void push(int data) throws ArrayIndexOutOfBoundsException{
		try {
			stack[lastElementPosition] = data;
		} catch (ArrayIndexOutOfBoundsException stackOverFlow) {
			throw stackOverFlow;
		}
		lastElementPosition++;
	}
	
	public void pop() {
		
	}
	
	public void peek() {
		
	}
	
	public int size() {
		return 0;
	}
	
	public boolean isEmpty() {
		return true;
	}

	public void show() {
		for (int i=0; i<lastElementPosition; i++) {
			System.out.print(stack[i] + " ");
		}
	}
}
