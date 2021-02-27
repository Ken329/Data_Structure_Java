package Data_Structure;

public class tree_checkBST {
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	public static class check{
		Node root;
		public int min() {
			int min = root.data;
			while(root.left != null) {
				min = root.left.data;
				root = root.left;
			}
			return min;
		}
		public int max() {
			int max = root.data;
			while(root.right != null) {
				max = root.right.data;
				root = root.right;
			}
			return max;
		}
		public boolean checking() {
			return reChecking(root, min(), max()); 
		}
		public boolean reChecking(Node node, int min, int max) {
			if(node == null) {
				return true;
			}
			if(node.data < min || node.data > max){
				return false;
			}
			return reChecking(node.left, min, node.data - 1) && reChecking(node.right, node.data + 1, max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check tree = new check();
		tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
		System.out.println("Is tree BST: " + tree.checking());
	}

}
