public class Queue{
	private LinkedList queue;

	public Queue(){
		queue = new LinkedList();
	}

	public void enqueue(int data){
		queue.insert(data);
	}

	public int dequeue(){
		if( queue.isEmpty() ){
			return -1;
		}

		int temp = queue.peekAt(0);
		queue.removeAt(0);
		
		return temp;
	}

	public int peek(){
		if( queue.isEmpty() ){
			return -1;
		}

		return queue.peekAt(0);
	}

	public void printQueue(){
		queue.printList();
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