package Interview;

import java.util.*;

public class tree_breatheFirstSearch {
	// it will search level by level, try to get the result
	// or print level by level
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	Node root;
	public void insert(int data) {
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
	public boolean breatheTra(int data) { // this will go from level to level 
		Queue<Node> q = new LinkedList<>();
		if(root == null) {
			return false;
		}
		q.clear();
		q.add(root);
		while(!q.isEmpty()) {
			Node node = q.remove();
			if(node.data == data) {
				return true;
			}else {
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_breatheFirstSearch tree = new tree_breatheFirstSearch();
		tree.insert(11);
		tree.insert(5);
		tree.insert(9);
		tree.insert(15);
		tree.show(tree.root);
		System.out.println();
		System.out.println("Answer: " + tree.breatheTra(12));
	}

}
