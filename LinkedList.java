public class LinkedList{
	private Node head = null;
	private Node last = null;
	private int length = 0;

	private class Node{
		private int data;
		private Node next = null;
		private Node(int data){
			this.data = data;
		}
	}

	public Boolean isEmpty(){
		if(this.head == null){
			return true;
		}

		return false;
	}

	public int listLength(){
		return this.length;
	}

	public void insertAt(int index, int data){
		if(index == 0){
			Node temp = new Node(data);
			temp.next = this.head;
			this.head = temp;
			this.length++;
			return;
		}
		if(index == this.length - 1){
			this.last.next = new Node(data);
			this.last = this.last.next;
			this.length++;
			return;
		}

		int idx = 1;
		Node curr = this.head;
		while(curr.next != null){
			if(idx == index){
				Node temp = curr.next;
				curr.next = new Node(data);
				curr.next.next = temp;
				this.length++;
				return;
			}
			idx++;
			curr = curr.next;
		}
	}

	public void removeAt(int index){
		if(this.head == null){
			return;
		} 
		if(index == 0){
			this.head = this.head.next;
			this.length--;
			return;
		}

		int idx = 1;
		Node curr = this.head;
		while(curr.next != null){
			if(idx == index){
				curr.next = curr.next.next;
				this.length--;
				break;
			}
			idx++;
			curr = curr.next;
		}
	}

	public int peekAt(int index){
		if(this.head == null){
			return -1;
		}

		int idx = 0;
		Node curr = this.head;
		while(curr != null){
			if(idx == index){
				return curr.data;
			}
			idx++;
		}

		return -1;
	}

	public void insert(int data){
		if(this.length == 0){
			insertAt(0, data);
		} else{
			insertAt(this.length - 1, data);
		}
	}

	public void remove(){
		removeAt(this.length - 1);
	}

	public void remove(int data){
		if(this.head == null){
			return;
		}
		if(this.head.data == data){
			this.head = this.head.next;
			this.length--;
			return;
		}

		Node curr = this.head;
		while(curr.next != null){
			if(curr.next.data == data){
				curr.next = curr.next.next;
				this.length--;
				break;
			}
			curr = curr.next;
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

	public static void main(String [] args){
		System.out.println("LinkedList mini unit tests:");
		LinkedList list = new LinkedList();
		
		list.remove(1);

		list.insert(1);
		list.insert(7);
		list.insert(5);
		
		list.insert(10);
		list.remove(2);

		list.printList();

		list.remove(7);
		list.remove(10);

		list.printList();

		list.remove(1);
		list.remove(5);

		list.printList();
	}
}