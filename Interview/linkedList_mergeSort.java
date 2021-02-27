package Interview;

public class linkedList_mergeSort {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void add(int data){
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
	public Node mergeSort(Node n) {
		if(n == null || n.next == null) {
			return n;
		}
		Node mid = getMid(n);
		Node midNext = mid.next;
		
		mid.next = null;
		
		Node left = mergeSort(n); // it 
		Node right = mergeSort(midNext);
		
		Node sortedList = sorted(left, right);
		return sortedList;
	}
	public Node getMid(Node n) {
		Node slow = n;
		Node fast = n;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public Node sorted(Node n1, Node n2) {
		Node result = null;
		if(n1 == null) {
			return n2;
		}
		if(n2 == null) {
			return n1;
		}
		if(n1.data < n2.data) {
			result = n1;
			result.next = sorted(n1.next, n2);
		}else {
			result = n2;
			result.next = sorted(n1, n2.next);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList_mergeSort link = new linkedList_mergeSort();
		link.add(21);
		link.add(5);
		link.add(9);
		link.add(15);
		link.add(12);
		link.add(17);
		link.show();
		link.head = link.mergeSort(link.head);
		link.show();
	}

}
