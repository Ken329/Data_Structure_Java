package Data_Structure;

public class linkedList_mergeSort {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void push(int data){
		Node node = new Node(data);
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
	public void show(Node n) {
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public Node mergeSort(Node h) {
		if(h == null || h.next == null) {
			return h;
		}
		Node middle = getMiddle(h);
		Node middleNext = middle.next;
		
		middle.next = null;
		
		Node left = mergeSort(h); // left index of the list
		Node right = mergeSort(middleNext); // middle index of the list
		
		Node sortedList = sortedMerge(left, right);
		return sortedList;
	}
	public Node getMiddle(Node head) { //  get the middle index of the list
		if(head == null) {
			return head;
		}
		Node slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next; // slow is the middle index
			fast = fast.next.next; // the end of the list
		}
		return slow;
	}
	public Node sortedMerge(Node a, Node b) {
		Node result;
		if(a == null) {
			return b;
		}
		if(b == null) {
			return a;
		}
		if(a.data <= b.data) { // if a is smaller than b and it recall the function again and again 
			result = a;
			result.next = sortedMerge(a.next, b);
		}else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	public static void main(String args[]) {
		linkedList_mergeSort link = new linkedList_mergeSort();
		link.push(12);
		link.push(4);
		link.push(54);
		link.push(8);
		link.push(23);
		link.push(22);
		link.head = link.mergeSort(link.head);
		System.out.print("Sorted Linked List is: "); 
		link.show(link.head);
	}
}
