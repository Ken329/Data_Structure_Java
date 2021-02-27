package Data_Structure;

public class linkedList_insertionSort {
	// insertion sort for linked list
	// insertion sort will sort automatically for you when your insert your data
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void insertionSort(int data) {
		Node node = new Node(data);
		Node curr = head;
		if(head == null) {
			head = node;
			node.next = head;
		}else if(curr.data >= node.data) { // cause head will always be the smallest data among the whole linked list
			                               // so if curr data is smaller than head curr will be the new head 
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = node;
			node.next = head;
			head = node;
		}else { // it will stop when the while loop realize that the next data is bigger than your curr
			while(curr.next != head && curr.next.data <= node.data) {
				curr = curr.next;
			}
			node.next = curr.next;
			curr.next = node;
		}
	}
	public void show() {
		Node n = head;
		System.out.print("Elements :");
		do {
			System.out.print(n.data + " ");
			n = n.next;
		}while(n != head);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 5, 12, 6, 1, 9};
		linkedList_insertionSort link = new linkedList_insertionSort();
		for(int i= 0; i < num.length; i++) {
			link.insertionSort(num[i]);
		}
		link.show();
	}

}
