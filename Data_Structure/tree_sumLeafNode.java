package Data_Structure;

public class tree_sumLeafNode {
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
	public void show(Node node) {
		if(node != null) {
			show(node.left);
			System.out.print(node.data + " ");
			show(node.right);
		}
	}
	public int sum(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return root.data;
		}
		return sum(root.left) + sum(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_sumLeafNode tree = new tree_sumLeafNode();
		tree.add(32);
		tree.add(12);
		tree.add(54);
		tree.add(45);
		tree.add(8);
		tree.add(29);
		tree.show(tree.root);
		System.out.println();
		System.out.println("Sum: " + tree.sum(tree.root));
	}

}
