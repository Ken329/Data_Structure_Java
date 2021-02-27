package Data_Structure;

public class stack_findMid_linkedList {
	// this linked list apply with stack function 
	// first in first out concept
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static class linkedList{
		Node head;
		public void push(int data) {
			Node node = new Node(data);
			if(head == null) {
				head = node;
			}else {
				node.next = head;
				head = node;
			}
		}
		public void show() {
			Node n = head;
			System.out.print("Elements: ");
			while(n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();
		}
		public int pop() {
			int pop = 0;
			if(head == null) {
				System.out.println("Stack is empty please check!!!");
			}else {
				pop = head.data;
				head = head.next;
			}
			return pop;
		}
		public int peek() {
			return head.data;
		}
		public int size() {
			int count = 0;
			Node n = head;
			while(n != null) {
				count++;
				n = n.next;
			}
			return count;
		}
		public int getMid() {
			int count = size() / 2;
			Node n = head;
			for(int i = 0; i < count; i++) {
				n = n.next;
			}
			return n.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList link = new linkedList();
		link.push(12);
		link.push(23);
		link.push(1);
		link.push(11);
		link.push(32);
		link.push(6);
		link.show();
		System.out.println("Pop value: " + link.pop());
		link.show();
		System.out.println("Peek: " + link.peek());
		System.out.println("Middle value: " + link.getMid());
	}

}
