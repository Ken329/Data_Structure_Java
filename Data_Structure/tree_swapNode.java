package Data_Structure;

import org.w3c.dom.Node;

public class tree_swapNode {
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
			return;
		}
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
			}else{
				focus = focus.right;
				if(focus == null) {
					parent.right = new Node(data);
					return;
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
	public void swaping(int s1, int s2) {
		Node n1 = swap(s1);
		Node n2 = swap(s2);
		int temp = n1.data;
		n1.data = n2.data;
		n2.data = temp;
	}
	public Node swap(int data) {
		Node n = root;
		while(true) {
			if(data < n.data) {
				n = n.left;
			}else if(data > n.data) {
				n = n.right;
			}else {
				return n;
			}
		}
	}
	public static void main(String [] args) {
		tree_swapNode tree = new tree_swapNode();
		tree.add(23);
		tree.add(12);
		tree.add(6);
		tree.add(9);
		tree.add(43);
		tree.add(45);
		tree.show(tree.root);
		System.out.println();
		tree.swaping(9, 12);
		tree.show(tree.root);
	}
}
