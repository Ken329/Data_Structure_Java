package Data_Structure;

public class linkedList_queue {
	// first in first out 
	public static class Node{
		int data;
		Node next;
	}
	public static class queue{
		Node head; // this ndoe is to store the head node
		Node rear; // this node is to store the tail node
		public void enQueue(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			if(head == null) {
				head = node;
				rear = node;
			}else {
				Node n = head;
				while(n.next != null) {
					n = n.next;
				}
				n.next = node;
				rear = node;
			}
		}
		public void deQueue() {
			// dequeue will move the head node to the next node
			if(head == null) {
				System.out.println("Sorry but the queue is empty");
			}else {
				head = head.next;
			}
		}
		public void show() {	
			Node n = head;
			System.out.print("Elements : ");
			while(n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();
		}
		public int peek() {
			// get the head value
			return head.data;
		}
		public int rear() {
			// get the rear value
			return rear.data;
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
		public boolean isEmpty() {
			boolean check = false;
			if(head == null) {
				check = true;
			}
			return check;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		q.enQueue(13);
		q.enQueue(22);
		q.enQueue(8);
		q.enQueue(6);
		q.show();
		q.deQueue();
		q.show();
		System.out.println("Head : " + q.peek());
		System.out.println("Tail : " + q.rear());
		System.out.println("Size : " + q.size());
		System.out.println("Is Empty : " + q.isEmpty());
	}

}
