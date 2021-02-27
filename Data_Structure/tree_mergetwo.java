package Data_Structure;

public class tree_mergetwo {
	public class Node{
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
	public void add(int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			Node focus = root;
			Node parent;
			while(true) {
				parent = focus;
				if(data < focus.data) {
					focus = focus.left;
					if(focus == null) {
						parent.left = new Node(data);
						return;
					}
				}else {
					focus = focus.right;
					if(focus == null) {
						parent.right = new Node(data);
						return;
					}
				}
			}
		}
	}
	public void delete(int data) {
		root = deleteRec(root, data);
	}
	public Node deleteRec(Node root, int data) {
		if(root == null) {
			return null;
		}
		if(data < root.data) {
			root.left = deleteRec(root.left, data);
		}else if(data > root.data) {
			root.right = deleteRec(root.right, data);
		}else {
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}else {
				root.data = min(root);
				root.right = deleteRec(root.right, root.data);
			}
		}
		return root;
	}
	public int min(Node node) {
		int min = 0;
		while(node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}
	public void show(Node node) {
		if(node != null) {
			show(node.left);
			System.out.print(node.data + " ");
			show(node.right);
		}
	}
	public Node mergeTwo(Node n1, Node n2) {
		if(n1 == null) {
			return n2;
		}
		if(n2 == null) {
			return n1;
		}
		n1.data += n2.data;
		n1.left = mergeTwo(n1.left, n2.left);
		n1.right = mergeTwo(n1.right, n2.right);
		return n1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_mergetwo tree = new tree_mergetwo();
		tree_mergetwo tree1 = new tree_mergetwo();
		tree.add(22);
		tree.add(10);
		tree.add(4);
		tree.add(30);
		tree.add(25);
		tree.add(14);
		System.out.print("Tree Node 1: ");
		tree.show(tree.root);
		System.out.println();
		tree1.add(5);
		tree1.add(4);
		tree1.add(12);
		tree1.add(8);
		System.out.print("Tree Node 2: ");
		tree.show(tree1.root);
		System.out.println();
		tree.root = tree1.mergeTwo(tree.root, tree1.root);
		System.out.print("Merge both Tree Node: ");
		tree.show(tree.root);
	}

}
