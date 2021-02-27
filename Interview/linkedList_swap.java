package Interview;

public class linkedList_swap {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void add(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = new Node(data);
		}
	}
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	public void swap(int x, int y) {
		if(x == y) {
			return;
		}
		Node currX = head;
		Node prevX = null;
		while(currX != null && currX.data != x) { // stops while x finds its data
			prevX = currX; // this node store the node before x node
			currX = currX.next;
		}
		Node currY = head;
		Node prevY = null;
		while(currY != null && currY.data != y) { // stops while y finds its data
			prevY = currY;
			currY = currY.next;
		}
		if(prevX != null) {
			prevX.next = currY;
		}else {
			head = currY;
		}
		if(prevY != null) {
			prevY.next = currX;
		}else {
			head = currX;
		}
		
		Node temp = currY.next;
		currY.next = currX.next;
		currX.next = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList_swap link = new linkedList_swap();
		link.add(21);
		link.add(23);
		link.add(9);
		link.add(5);
		link.add(13);
		link.show();
		link.swap(21, 5);
		link.show();
	}

}
