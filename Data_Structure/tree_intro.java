package Data_Structure;

public class tree_intro {
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		Node root = first; // root is basically the top element of the tree
		first.left = second; // second < root > right
		first.right = third;
		second.left = fourth; // fourth < root > fifth
		second.right = fifth;
		
		//      1            the tree should have look like this 
		//     / \
		//    2   3
		//   / \
		//  4   5
	}

}
