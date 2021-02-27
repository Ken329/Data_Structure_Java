package Interview;

public class tree_BST {
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
	public void show(Node head) {
		Node n = head;
		if(n != null) {
			show(n.left);
			System.out.print(n.data + " ");
			show(n.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_BST tree = new tree_BST();
		tree.add(21);
		tree.add(6);
		tree.add(9);
		tree.add(13);
		tree.add(25);
		tree.show(tree.root);
	}

}
