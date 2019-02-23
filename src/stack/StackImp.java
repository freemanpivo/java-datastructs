package stack;

public class StackImp {

	private static final int STACK_SIZE = 5;
	private int lastElementPosition = 0;
	private int stack[] = new int[STACK_SIZE];
	
	public void push(int data) throws ArrayIndexOutOfBoundsException{
		
		try {
			stack[lastElementPosition] = data;
			lastElementPosition++;
		} catch (ArrayIndexOutOfBoundsException stackOverFlow) {
			throw stackOverFlow;
		}
	
	}
	
	public void pop() throws EmptyStackImpException{
		
		try {
			if (lastElementPosition == 0) {
				throw new EmptyStackImpException();
			} else {
				lastElementPosition--;
				stack[lastElementPosition] = 0;
			}
		} catch (EmptyStackImpException e) {
			throw e;
		}
	}
	
	public int peek() {
		 if (lastElementPosition == 0)
			 return 0;
		 else 
			 return stack[lastElementPosition-1];
	}
	
	public int size() {
		return lastElementPosition;
	}
	
	public boolean isEmpty() {
		if (lastElementPosition == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		for (int i=0; i<STACK_SIZE; i++) {
			System.out.print(stack[i] + " ");
		}
	}
}
