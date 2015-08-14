public class Queue{
	private int [] queue;
	private int N = 100;
	private int startIndex, endIndex;

	public Queue(){
		queue = new int[N];
		startIndex = 0;
		endIndex = startIndex;
	}

	public void enqueue(int data){
		if(endIndex == N - 1){
			if(endIndex - startIndex <= endIndex/startIndex){
				shiftQueue();
			}
			else{
				resizeQueue();
			}
		}

		queue[endIndex] = data;
		endIndex++;
	}

	public int dequeue(){
		if(startIndex == endIndex){
			return -1;
		}

		startIndex++;
		return queue[startIndex - 1];
	}

	public int peek(){
		if(startIndex == endIndex){
			return -1;
		}

		return queue[startIndex];
	}

	public void printQueue(){
		if(startIndex == endIndex){
			System.out.println(-1);
		}
		else{
			for(int i = startIndex; i < endIndex; i++){
				System.out.print(queue[i] + " ");
			}
		System.out.println();
		}
	}

	private void resizeQueue(){
		N *= 2;
		int [] newQueue = new int[N];
		int i;
		for(i = 0; i < endIndex - startIndex; i++){
			newQueue[i] = queue[startIndex + i];
		}
		this.queue = newQueue;
		startIndex = 0;
		endIndex = i;
	}

	private void shiftQueue(){
		int i;
		for(i = 0; i < endIndex - startIndex; i++){
			queue[i] = startIndex + i;
		}
		startIndex = 0;
		endIndex = i;
	}

	public static void main(String [] args){
		System.out.println("mini unit tests for queue:");
		Queue q = new Queue();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		q.printQueue();

		System.out.println(q.dequeue());

		q.printQueue();

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		q.printQueue();
	}
}