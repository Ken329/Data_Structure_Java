package Data_Structure;

public class tree_Bst {
	// Binary Search Tree
	// tree is basically build for data structure like hierarchy 
	// it is very easy to search data, insert, delete
	// searching(better than linked list but slower than array)
	// organize(better than array but slower than unordered linked list)
	// the top node call as ROOT
	// the bottom node we call it as LEAVE NODE
	// the link between all node called as EDGE
	public class Node{
		int key;
		String name;
		Node leftChild;
		Node rightChild;
		public Node(int key, String name) {
			this.key = key;
			this.name = name;
		}
		public String toString() {
			return key + " has a name " + name;
		}
	}
	Node root;
	public void insert(int key, String name) {
		Node node = new Node(key, name);
		if(root == null) {
			root = node;
		}else {
			Node focusNode = root;
			Node parent;
			while(true) {
				parent = focusNode;
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null) {
						parent.leftChild = node;
						return;
					}
				}else {
					focusNode = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = node;
						return;
					}
				}
			}
		}
	}
	public void inOrderTravel(Node node) { // this will display the result from the left to root to right
		if(node != null) {
			inOrderTravel(node.leftChild);
			System.out.println(node);
			inOrderTravel(node.rightChild);
		}
	}
	public void postOrderTravel(Node node) { // this will display from left to right and the root
		if(node != null) {
			postOrderTravel(node.leftChild);
			postOrderTravel(node.rightChild);
			System.out.println(node);
		}
	}
	public Node findNode(int key) {
		Node focusNode = root;
		while(focusNode.key != key) {
			if(key < focusNode.key) {
				focusNode = focusNode.leftChild;
			}else {
				focusNode = focusNode.rightChild;
			}
			if(focusNode == null) {
				System.out.println("No result found");
			}
		}
		return focusNode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_Bst tree = new tree_Bst();
		tree.insert(23, "Boss");
		tree.insert(2, "manager");
		tree.insert(91, "ceo");
		tree.insert(54, "manager");
		tree.insert(7, "cleaner");
		System.out.println("Elements from left to root to right: ");
		tree.inOrderTravel(tree.root);
		System.out.println("Elements from left to right to root: ");
		tree.postOrderTravel(tree.root);
		System.out.println("Finding: " + tree.findNode(54));
	}

}
