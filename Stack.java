public class Stack{
	private int [] stack;
	private int currIndex, baseIndex;
	private int N = 100;

	public Stack(){
		stack = new int[N];
		baseIndex = 0;
		currIndex = baseIndex;
	}

	public void push(int data){
		if(currIndex == N - 1){
			resizeStack();
		}

		stack[currIndex] = data;
		currIndex++;
	}

	public int pop(){
		if(currIndex == baseIndex){
			return -1;
		}

		currIndex--;
		return stack[currIndex];
	}

	public int peek(){
		if(currIndex == baseIndex){
			return -1;
		}

		return stack[currIndex - 1];
	}

	public void printStack(){
		if(currIndex == baseIndex){
			System.out.println(-1);
		}
		else{
			for(int i = currIndex - 1; i >= 0; i--){
				System.out.print(stack[i] + " ");
			}
		System.out.println();
		}
	}

	private void resizeStack(){
		N *= 2;
		int [] newStack = new int[N];
		for(int i = 0; i < currIndex; i++){
			newStack[i] = stack[i];
		}

		this.stack = newStack;
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