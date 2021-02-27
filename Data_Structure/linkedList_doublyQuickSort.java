package Data_Structure;

public class linkedList_doublyQuickSort {
	public static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public static class LinkedList{
		Node head;
		Node tail;
		public void push(int data) {
			Node node = new Node(data);
			if(head == null) {
				head = node;
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
		public void show() {
			Node h = head;
			Node t = tail;
			System.out.print("Elements from head:");
			while(h != null) {
				System.out.print(h.data + " ");
				h = h.next;
			}
			System.out.println();
			System.out.print("Elements from tail:");
			while(t != null) {
				System.out.print(t.data + " ");
				t = t.prev;
			}
			System.out.println();
		}
		public Node lastNode(Node node) {
			Node n = node;
			while(n.next != null) {
				n = n.next;
			}
			return n;
		}
		public void quickSort(Node node) {
			Node head = lastNode(node); // it gets the last node of the linked list
			quick_sort(node, head);
		}
		public void quick_sort(Node l, Node h) {
			if(h != null && l != h && l != h.next) {
				Node temp = partition(l, h);
				quick_sort(l, temp.prev); // first half
				quick_sort(temp.next, h); // second half
			}
		}
		public Node partition(Node l, Node h) {
			int x = h.data; // this is the pivot
			
			Node i = l.prev;
			for(Node j=l; j!=h; j = j.next) {
				if(j.data <= x) { // if the low value is smaller than the pivot
					i = (i==null) ? l : i.next; // this is basically i++
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
			i = (i==null) ? l : i.next; // this is basically i++
			int temp = i.data;
			i.data = h.data;
			h.data = temp;
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		link.push(5);
		link.push(12);
		link.push(9);
		link.push(3);
		link.show();
		link.quickSort(link.head);
		link.show();
	}
}

