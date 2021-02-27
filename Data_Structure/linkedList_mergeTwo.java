package Data_Structure;
public class linkedList_mergeTwo {
	public static class Node{
		int data;
		Node next;
	}
	Node head;
	public void push(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public Node merge(Node h1, Node h2) {
		// dummy is a new node, while temp is a temporary node
		Node dummy = new Node();
		Node temp = dummy;
		while(true) {
			// if it is equal to null basically it is a empty link
			if(h1 == null) {
				temp.next = h2;
				break;
			}
			if(h2 == null) {
				temp.next = h1;
				break;
			}
			if(h1.data <= h2.data) { //  while if h1 is bigger than h2 than need to store h1 inside
				temp.next = h1;
				h1 = h1.next;
			}else {
				temp.next = h2;
				h2 = h2.next;
			}
			temp = temp.next;
		}
		return dummy.next;
	}
	public static void main(String args[]) {
		linkedList_mergeTwo link1 = new linkedList_mergeTwo();// first link
		linkedList_mergeTwo link2 = new linkedList_mergeTwo();// second link
		link1.push(20);
		link1.push(40);
		link1.push(60);
		link2.push(10);
		link2.push(30);
		link2.push(70);
		link1.head = link1.merge(link1.head, link2.head);
		link1.show();
	}
}
