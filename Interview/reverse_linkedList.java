package Interview;

public class reverse_linkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void insert(int data) {
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
	public void show(Node node) {
		System.out.print("Elements: ");
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_linkedList link = new reverse_linkedList();
		link.insert(32);
		link.insert(6);
		link.insert(9);
		link.insert(21);
		link.insert(48);
		link.show(link.head);
		link.reverse();
		link.show(link.head);
	}

}
