package Data_Structure;

public class linkedList_doubly {
	// doubly linked list is good at getting data from the back and front 
	// it make linked list even more easier to modify and organize
	// the pros about doubly linked list is it consume more bytes comparing to normla linked list
	// it require you to have two node at first 
	public class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null; // next value
			this.prev =  null; // previous value
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
			node.prev = n;
			n.next = node;
			tail = node;
		}
	}
	public void showHead() {
		Node n = head;
		System.out.print("Elements from head: ");
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	public void showTail() {
		Node n = tail;
		System.out.print("Elements from tail: ");
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.prev;
		}
		System.out.println();
	}
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head.prev = node;
		head = node;
	}
	public void insertLast(int data) {
		Node node = new Node(data);
		tail.next = node;
		node.prev = tail;
		tail = node;
	}
	public void delete(int data) {
		Node n = head;
		while(n != null && n.data != data) {
			n = n.next;
		}
		n.next.prev = n.prev; // n next value prev point to my n prev node
		n.prev.next = n.next; // n prev value next point to my n next node
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList_doubly link = new linkedList_doubly();
		link.push(21);
		link.push(98);
		link.push(97);
		link.showHead();
		link.showTail();
		link.insertFirst(32);
		link.showHead();
		link.showTail();
		link.insertLast(88);
		link.showHead();
		link.showTail();
		link.delete(21);
		link.showHead();
		link.showTail();
	}

}
