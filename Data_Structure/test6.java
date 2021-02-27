package Data_Structure;

public class test6 {
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
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
				if(data < focus.data) {
					focus = focus.left;
					if(focus == null) {
						parent.left = node;
						return;
					}
				}else {
					focus = focus.right;
					if(focus == null) {
						parent.right = node;
						return;
					}
				}
			}
		}
	}
	public void show(Node root) {
		if(root != null) {
			show(root.left);
			System.out.print(root.data + " ");
			show(root.right);
		}
	}
	public void delete(int data) {
		root = deleteRec(root, data);
	}
	public Node deleteRec(Node node, int data) {
		if(node == null) {
			return null;
		}
		if(data < node.data) {
			node.left = deleteRec(node.left, data);
		}else if(data > node.data) {
			node.right = deleteRec(node.right, data);
		}else {
			if(node.left == null) {
				return node.right;
			}else if(node.right == null) {
				return node.left;
			}else {
				node.data = min(node);
				node.right = deleteRec(node.right, node.data);
			}
		}
		return node;
	}
	public int min(Node node) {
		int min;
		min = node.data;
		while(node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6 tree = new test6();
		tree.insert(12);
		tree.insert(6);
		tree.insert(91);
		tree.insert(9);
		tree.insert(20);
		tree.show(tree.root);
		System.out.println();
		tree.delete(9);
		tree.show(tree.root);
	}

}
