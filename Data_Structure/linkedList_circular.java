package Data_Structure;

public class linkedList_circular {
	//circular linked list is a that will runs over and over again
	// pros: the last node link to head instead of null
	//       can start display at every node
	// can use for queue implement and so on
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
			node.next = head;
		}else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}
	public void show(int index) { // index is the position that i want to star from 
		Node n = head;
		for(int i = 0; i < index; i++) {
			n = n.next;
		}
		Node in = n;
		do {
			System.out.print(in.data + " ");
			in = in.next;
		}while(in != n);
		System.out.println();
	}
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		tail.next = node;
		head = node;
	}
	public void insertLast(int data) {
		Node node = new Node(data);
		tail.next = node;
		tail = node;
		tail.next = head;
	}
	public void delete(int index) {
		Node n = head;
		Node prev = null;
		for(int i = 0; i < index; i++) {
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList_circular link = new linkedList_circular();
		link.push(11);
		link.push(9);
		link.push(89);
		link.push(14);
		link.show(0);
		link.insertFirst(6);
		link.show(0);
		link.insertLast(22);
		link.show(0);
		link.delete(2);
		link.show(0);
	}

}
