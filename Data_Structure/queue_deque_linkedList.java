package Data_Structure;

public class queue_deque_linkedList {
	// this linked list implement the concept of deque
	// allow the user to track the data from the top or from the rear of the queue
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	Node tail;
	public void push(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			tail = node;
		}
	}
	public void show() {
		Node n = head;
		System.out.print("Elements: ");
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	public int getHead() {
		return head.data;
	}
	public int getTail() {
		return tail.data;
	}
	public void removeFromHead() {
		head = head.next;
	}
	public void removeFromtail() {
		Node last = head;
		Node prevL = null;
		while(last.next != null) {
			prevL = last;
			last = last.next;
		}
		prevL.next = null;
		tail = prevL;
	}
	public void insertFront(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public void insertTail(int data) {
		Node node = new Node(data);
		tail.next = node;
		tail = node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_deque_linkedList dq = new queue_deque_linkedList();
		dq.push(32);
		dq.push(1);
		dq.push(43);
		dq.push(21);
		dq.push(18);
		dq.push(19);
		dq.show();
		System.out.println("Head: " + dq.getHead());
		System.out.println("Tail: " + dq.getTail());
		dq.removeFromHead();
		dq.show();
		dq.removeFromtail();
		dq.show();
		System.out.println("Head: " + dq.getHead());
		System.out.println("Tail: " + dq.getTail());
		dq.insertFront(55);
		dq.show();
		dq.insertTail(51);
		dq.show();
		System.out.println("Head: " + dq.getHead());
		System.out.println("Tail: " + dq.getTail());
	}

}
