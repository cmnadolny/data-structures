public class Stack{
	private LinkedList stack;

	public Stack(){
		stack = new LinkedList();
	}

	public void push(int data){
		stack.insertAt(0, data);
	}

	public int pop(){
		if( stack.isEmpty() ){
			return -1;
		}
		int temp = stack.peekAt(0);
		stack.removeAt(0);

		return temp;
	}

	public int peek(){
		return stack.peekAt(0);
	}

	public void printStack(){
		stack.printList();
	}

	public static void main(String [] args){
		System.out.println("mini unit tests for stack:");
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);

		s.printStack();

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());
		s.printStack();
	}
}