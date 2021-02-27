package Interview;

public class linkedlist_merge {
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
	}
	public Node mergeTwo(Node n1, Node n2) {
		Node dummy = new Node(0);
		Node temp = dummy;
		while(true) {
			if(n1 == null) {
				temp.next = n2;
				break;			}
			if(n2 == null) {
				temp.next = n1;
				break;
			}
			if(n1.data < n2.data) {
				temp.next = n1;
				n1 = n1.next;
			}else {
				temp.next = n2;
				n2 = n2.next;
			}
			temp = temp.next;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist_merge link = new linkedlist_merge();
		linkedlist_merge link1 = new linkedlist_merge();
		link.add(6);
		link.add(9);
		link.add(12);
		link.add(15);
		
		link1.add(1);
		link1.add(3);
		link1.add(6);
		link1.add(11);

		link.head = link.mergeTwo(link.head, link1.head);
		link.show();
	}

}
