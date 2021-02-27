package Data_Structure;

public class tree_deleteNode {
	// delete a node have 3 cases
	// 1. a leave node just return null to that node
	// 2. a node with 1 child, replace the child the the node that you want to delete
	// 3. a node with 2 children, find the smallest value in your subtree and replace the value of the node that you want to delete
	// and delete the smallest value of the node
	public class Node{
		int data;
		Node leftChild;
		Node rightChild;
		public Node(int data) {
			this.data = data;
		}
		public String toString() {
			return "Value key is: " + data;
		}
	}
	Node root;
	public void insert(int data) {
		Node node = new Node(data);
		if(root == null) {
			root = node;
		}else {
			Node focus = root;
			Node parent;
			while(true) {
				parent = focus;
				if(data < focus.data) { // if the data is lesser than the focus data it will go to the left
					focus = focus.leftChild; // focus will become the leftChild
					if(focus == null) { // if the focus is null basically it is the last child 
						parent.leftChild = node;
						return;
					}
				}else {// if the data is bigger than the focus data it will go to the right
					focus = focus.rightChild;
					if(focus == null) {
						parent.rightChild = node;
						return;
					}
				}
			}
		}
	}
	public void inOrderTravel(Node node) {
		if(node != null) {
			inOrderTravel(node.leftChild);
			System.out.println(node);
			inOrderTravel(node.rightChild);
		}
	}
	public void delete(int data) {
		root = recDelete(root, data);
	}
	public Node recDelete(Node node, int data) {
		if(node == null) {
			return null;
		}
		if(data < node.data) {
			node.leftChild = recDelete(node.leftChild, data);
		}else if(data > node.data){
			node.rightChild = recDelete(node.rightChild, data);
		}else {
			if(node.leftChild == null && node.rightChild == null){
				node = null;
			}else if(node.rightChild != null) {
				node.data = minRight(node);
				node.rightChild = recDelete(node.rightChild, node.data);
			}else {
				node.data = minLeft(node);
				node.leftChild = recDelete(node.leftChild, node.data);
			}
		}
		return node;
	}
	public int minValue(Node node) {
		int min = node.data;
		while(node.leftChild != null) {
			min = node.leftChild.data;
			node = node.leftChild;
		}
		return min;
	}
	public int minLeft(Node node) {
		node = node.leftChild;
		while(node.rightChild != null) {
			node = node.rightChild;
		}
		return node.data;
	}
	public int minRight(Node node) {
		node = node.rightChild;
		while(node.leftChild != null) {
			node = node.leftChild;
		}
		return node.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_deleteNode tree = new tree_deleteNode();
		tree.insert(32);
		tree.insert(12);
		tree.insert(54);
		tree.insert(6);
		tree.insert(33);
		tree.insert(8);
		tree.inOrderTravel(tree.root);
		System.out.println();
		tree.delete(32);
		tree.inOrderTravel(tree.root);
	}

}
