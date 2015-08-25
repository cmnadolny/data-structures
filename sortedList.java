public class sortedList{
	private Node head = null;

	private class Node{
		int data;
		private Node next = null;
		private Node(int data){
			this.data = data;
		}
	}

	public void insert(int data){
		if(this.head == null){
			this.head = new Node(data);
			return;
		}

		Node curr = this.head;

		if(curr.data == data){
			curr = new Node(data);
			curr.next = this.head;
			this.head = curr;
		} else{
			while(curr.next != null && curr.next.data <= data){
				curr = curr.next;
			}

			Node temp = curr.next;
			curr.next = new Node(data);
			curr.next.next = temp;
		}
	}

	public Boolean detectCycle(){
		//TODO
		Node slow = this.head;
		Node fast = this.head;

		return true;
	}

	public void remove(int data){
		if(this.head == null){
			return;
		}
		else if(this.head.data == data){
			this.head = this.head.next;
		}
		else{
			Node curr = this.head;
			int count = 0;
			while(curr.next != null){
				if(curr.next.data == data){
					curr.next = curr.next.next;
					return;
				}

				curr = curr.next;
			}
		}
	}

	public void printList(){
		if(this.head == null){
			System.out.println("Empty list");
		}
		else{
			Node curr = this.head;

			while(curr != null){
				System.out.print(curr.data + " ");
				curr = curr.next;
			}

			System.out.println();
		}
	}

	public static sortedList mergeLists(sortedList a, sortedList b){
		//TODO
		
		if(a == null){
			return b;
		}

		if(b == null){
			return a;
		}

		return null;
	}

	public void mergeKLists(sortedList [] lists){
		//TODO

	}

	public static void main(String [] args){
		System.out.println("sortedList mini unit tests:");
		sortedList list = new sortedList();

		list.remove(1);
		list.printList();

		list.insert(1);
		list.insert(7);
		list.insert(5);
		list.insert(10);
		list.insert(2);
		list.insert(10);

		list.printList();

		list.remove(7);
		list.remove(9);
		list.remove(10);

		list.printList();
	}
}