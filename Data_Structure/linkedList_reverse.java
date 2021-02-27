package Data_Structure;

public class linkedList_reverse {
	private static class Node{
		int data;
		Node next;
	}
	private static class linkedList{
		Node head;
		public void insert(int data) {
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
			System.out.print("Elements: ");
			while(n.next != null) {
				int data = n.data;
				n = n.next;
				System.out.print(data + " ");
			}
			System.out.println(n.data);
		} 
		public void reverse() {
			// iterative way to reverse the linked list 
			Node prev = null;
			Node current = head;
			Node next = null;
			while(current != null) {
				next = current.next; // point to the current next node
				current.next = prev; // current point to the prev node
				prev = current; // prev node current node
				current = next; // current node go to the next node
			}
			head = prev; // prev node will be end in the last node, cause current node willbe null
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList link = new linkedList();
		link.insert(10);
		link.insert(1);
		link.insert(22);
		link.insert(13);
		link.insert(16);
		link.show();
		link.reverse();
		link.show();
	}

}
