package Data_Structure;

public class tree_minValue {
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	Node root;
	void add(int data) {
		root = deleteRec(root, data); 
	}
	Node deleteRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}else {
			if(data < root.data) {
				root.left = deleteRec(root.left, data);
			}else if(data > root.data) {
				root.right = deleteRec(root.right, data);
			}
		}
		return root;
	}
	int getMin() {
		Node n = root;
		int min = n.data;
		while(n.left != null) {
			min = n.left.data;
			n = n.left;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_minValue tree = new tree_minValue();
		tree.add(11);
		tree.add(43);
		tree.add(54);
		tree.add(21);
		tree.add(3);
		tree.add(8);
		System.out.println("Minimum Value: " + tree.getMin());
	}

}
