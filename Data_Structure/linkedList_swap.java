package Data_Structure;

public class linkedList_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		link myLink = new link();
		myLink.insert(12);
		myLink.insert(1);
		myLink.insert(32);
		myLink.insert(22);
		myLink.insert(6);
		myLink.insert(3);
		myLink.show();
		myLink.swap(12, 6);
		myLink.show();
		
	}
}
class link{
	myNode head;
	public void insert(int data) {
		myNode node = new myNode();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}else {
			myNode n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public int size() {
		myNode n = head;
		int count = 0;
		while(n.next != null) {
			n = n.next;
			count++;
		}
		count += 1;
		return count;
	}
	public void show() {
		myNode node = head;
		System.out.print("Element : ");
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	public boolean check(int data) {
		int size = size();
		myNode node = head;
		boolean ans = false;
		for(int i = 0; i < size; i++) {
			int d = node.data;
			node = node.next;
			if(d == data) {
				ans = true;
				break;
			}
		}
		return ans;
	}
	public void swap(int x, int y) {
		if(x == y) {
			return;
		}
		myNode currX = head;
		myNode prevX = null;
		while(currX != null && currX.data != x) { // stops while x finds its data
			prevX = currX; // this node store the node before x node
			currX = currX.next;
		}
		myNode currY = head;
		myNode prevY = null;
		while(currY != null && currY.data != y) { // stops while y finds its data
			prevY = currY;
			currY = currY.next;
		}
		if(prevX != null) {
			prevX.next = currY;
		}else {
			head = currY;
		}
		if(prevY != null) {
			prevY.next = currX;
		}else {
			head = currX;
		}
		
		myNode temp = currY.next;
		currY.next = currX.next;
		currX.next = temp;
	}
}
class myNode{
	int data;
	myNode next;
}
