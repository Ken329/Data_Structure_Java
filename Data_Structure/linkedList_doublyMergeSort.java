package Data_Structure;

public class linkedList_doublyMergeSort {
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
		public void show(Node node) {
			Node t = null;
			System.out.print("Elements from head: ");
			while(node != null) {
				System.out.print(node.data + " ");
				t = node;
				node = node.next;
			}
			System.out.println();
			System.out.print("Elements from tail: ");
			while(t != null) {
				System.out.print(t.data + " ");
				t = t.prev;
			}
			System.out.println();
		}
		public Node mergeSort(Node h) {
			if(h == null || h.next == null) {
				return h;
			}
			Node middle = getMid(h);
			Node middleNext = middle.next;
			
			middle.next = null;
			
			Node left = mergeSort(h);
			Node right = mergeSort(middleNext);
			
			Node sortedList = sorted(left, right);
			return sortedList;
		}
		public Node getMid(Node head) {
			if(head == null) {
				return head;
			}
			Node slow = head, fast = head;
			while(fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
		public Node sorted(Node a, Node b) {
			Node result;
			if(a == null) {
				return b;
			}
			if(b == null) {
				return a;
			}
			if(a.data <= b.data) { 
				result = a;
				result.next = sorted(a.next, b);
			}else {
				result = b;
				result.next = sorted(a, b.next);
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		link.push(5);
		link.push(12);
		link.push(9);
		link.push(18);
		link.push(43);
		link.push(3);
		link.show(link.head);
		Node n = link.mergeSort(link.head);
		link.show(n);
	}

}
