package Data_Structure;

import Data_Structure.hasing_checkLinkedList.Node;

public class tree_recursiveBST {
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
		root = addRec(root, data);
	}
	public Node addRec(Node root , int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}else {
			if(data < root.data) {
				root.left = addRec(root.left, data);
			}else if(data > root.data) {
				root.right = addRec(root.right, data);
			}
		}
		return root;
	}
	public void show(Node node) {
		if(node != null) {
			show(node.left);
			System.out.print(node.data + " ");
			show(node.right);
		}
	}
	public void delete(int data) {
		root = deleteRec(root, data);
		System.out.println("Deleted Data: " + data);
	}
	public Node deleteRec(Node root, int data) {
		if(root == null) {
			return null;
		}else {
			if(data < root.data) {
				root.left = deleteRec(root.left, data);
			}else if(data > root.data) {
				root.right = deleteRec(root.right, data);
			}else {
				if(root.left == null && root.right == null) {
					return null;
				}
				if(root.left != null) {
					root.data = minLeft(root);
					root.left = deleteRec(root.left, root.data);
				}else {
					root.data = minRight(root);
					root.right = deleteRec(root.right, root.data);
				}
			}
		}
		return root;
	}
	public int minLeft(Node node) {
		node = node.left;
		while(node.right != null) {
			node = node.right;
		}
		return node.data;
	}
	public int minRight(Node node) {
		node = node.right;
		while(node.left != null) {
			node = node.left;
		}
		return node.data;
	}
	public int min(Node node) {
		int min = node.data;
		while(node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_recursiveBST t = new tree_recursiveBST();
		t.add(31);
		t.add(6);
		t.add(95);
		t.add(25);
		t.add(51);
		t.show(t.root);
		System.out.println();
		t.delete(31);
		t.show(t.root);
	}

}
