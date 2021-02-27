package Interview;
import java.util.*;

import Interview.tree_breatheFirstSearch.Node;
public class tree_depthFirstSearch {
	// depth first search will kept on dive until the end of left sub tree and see it there any right node 
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
	public void show(Node node) { // this is consider as depth first travesal
		if(node != null) {
			show(node.left);
			System.out.print(node.data + " ");
			show(node.right);
		}
	}
	public boolean depthFirstSeacrh(Node root, int data) {
		Stack<Node> s = new Stack<>();
		boolean ans = false;
		if(root == null) {
			return false;
		}
		s.clear();
		s.add(root);
		while(!s.isEmpty()) {
			Node node = s.pop();
			if(node.data == data) {
				ans = true;
				break;
			}else {
				if(node.left != null) {
					s.add(node.left);
				}
				if(node.right != null) {
					s.add(node.right);
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_depthFirstSearch tree = new tree_depthFirstSearch();
		tree.insert(22);
		tree.insert(29);
		tree.insert(6);
		tree.insert(12);
		tree.insert(37);
		tree.insert(33);
		tree.show(tree.root);
		System.out.println();
		System.out.println(tree.depthFirstSeacrh(tree.root, 37));
		
	}

}
