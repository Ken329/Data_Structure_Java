package Data_Structure;
import java.util.*;
public class hasing_checkLinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void add(int data) {
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
	public void show(Node node) {
		System.out.print("Elements: ");
		Node n = node;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	public LinkedList<Integer> interact(Node n1, Node n2) {
		HashSet<Integer> hash =  new HashSet<>();
		LinkedList<Integer> ans = new LinkedList<>();
		while(n1 != null) {
			hash.add(n1.data);
			n1 = n1.next;
		}
		while(n2 != null) {
			if(hash.contains(n2.data)) {
				ans.push(n2.data);
			}
			n2 = n2.next;
		}
		return ans;
	}
	public LinkedList<Integer> union(Node n1, Node n2){
		LinkedList<Integer> ans = new LinkedList<>();
		while(n1 != null) {
			ans.add(n1.data);
			n1 = n1.next;
		}
		while(n2 != null) {
			if(!ans.contains(n2.data)) {
				ans.add(n2.data);
			}
			n2 = n2.next;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasing_checkLinkedList hashing = new hasing_checkLinkedList();
		hasing_checkLinkedList hashing1 = new hasing_checkLinkedList();
		
		hashing.add(20);
		hashing.add(4);
		hashing.add(15);
		hashing.add(10);
		
		hashing1.add(10);
		hashing1.add(2);
		hashing1.add(4);
		hashing1.add(8);
		
		hashing.show(hashing.head);
		hashing1.show(hashing1.head);
		System.out.println("Interact numbers: " + hashing.interact(hashing.head, hashing1.head));
		System.out.println("Union numbers: " + hashing.union(hashing.head, hashing1.head));
	}

}
