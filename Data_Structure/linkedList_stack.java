package Data_Structure;

public class linkedList_stack {
	// first in first out
	// 
	public static class Node{
		int data;
		Node next;
	}
	public static class linkedList{
		private Node top;
		public void push(int data) {
			// when pushing a new node, the node will become the top 
			Node node = new Node();
			node.data = data;
			node.next = top;
			top = node;
		}
		public void show() {
			Node n = top;
			System.out.println("Element : ");
			while(n != null) {
				System.out.println(n.data);
				n = n.next;
			}
		}
		public int peek() {
			// to get the top value of the stack 
			return top.data;
		}
		public void pop() {
			// to remove the top value of the stack, last in first out concept
			top = top.next;
		}
		public boolean isEmpty() {
			boolean check = false;
			if(top == null) {
				check = true;
			}
			return check;
		}
		public int size() {
			int count = 0;
			Node n = top;
			while(n != null) {
				count++;
				n = n.next;
			}
			return count;
		}
		public void search(int data) {
			boolean check = false;
			int count = 0;
			Node n = top;
			while(n != null) {
				count++;
				if(n.data == data) {
					check = true;
					break;
				}else {
					n = n.next;
				}
			}
			if(check == false) {
				System.out.println("Not found");
			}else {
				System.out.println("Found at index :" + count);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList link = new linkedList();
		link.push(10);
		link.push(8);
		link.push(13);
		link.push(3);
		link.show();
		System.out.println("Top value :" +link.peek());
		link.pop();
		link.show();
		System.out.println("Top value :" +link.peek());
		link.push(22);
		link.show();
		System.out.println("Top value :" +link.peek());
		System.out.println("Is stack empty : " + link.isEmpty());
		System.out.println("Size : " + link.size());
		link.search(8);
	}
}
