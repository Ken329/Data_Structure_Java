package Data_Structure;

public class linkedList_intro2 {
	// linked list link to every single node 
	// first node contain the address for next node
	// linkList is slow but easy to store and manageable capacity 
	// list address always start with 0
	// delete data basically moving the address to the next data, node couldn't be deleted fully
	// linked list is faster when you organize it compare to array list
	// while array list runs faster than linked list, array list is easier to search compare to linked list
	public static void main(String[] args) {
		linkedList list = new linkedList();
		list.insert(5);
		list.insert(13);
		list.insert(11);
		list.show();
		list.insertToFirst(21);
		System.out.print("Insert one element to the first : ");
		list.show();
		System.out.print("Insert one element at index 2 : ");
		list.insertAt(2, 10);
		list.show();
		list.deleteAt(3);
		list.show();
		System.out.println("Size : " + list.size());
		System.out.println("Is Empty : " + list.isEmpty());
	}
}
class linkedList{
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data; 
		node.next = null;
		
		if(head == null) {
			head = node; // if head is null which means this is the first data
		}else {
			Node n = head;
			while(n.next != null) { 
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	public void insertToFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head; // this node next will be head
		head = node; // and this node will recover as the head
	}
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0) { // if index = 0 which means the index is the head value just need to change the node
			insertToFirst(data);
		}else {
			Node n = head;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next; // this node will cover up the index
			n.next = node;
		}
	}
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next; // n1 is on the index place
			n.next  = n1.next; // while n.next = index + 1
			System.out.println("Deleted element : " + n1.data);
		}
	}
	public int size() {
		int count = 0;
		Node n = head;
		while(n.next != null) {
			n = n.next;
			count++;
		}
		count++;
		return count;
	}
	public boolean isEmpty() {
		boolean check = false;
		if(head == null) {
			check =  true;
		}
		return check;
	}
}
class Node{
	int data;
	Node next;
}