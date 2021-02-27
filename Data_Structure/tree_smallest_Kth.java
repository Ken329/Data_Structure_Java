package Data_Structure;

public class tree_smallest_Kth {
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
	int count = 0;
	public void add(int data) {
		if(root == null) {
			root = new Node(data);
			return;
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
				}else{
					focus = focus.right;
					if(focus == null) {
						parent.right = new Node(data);
						return;
					}
				}
			}
		}
	}
	public Node Ksmallest(Node node, int data) {
		if(node == null) {
			return null;
		}
		Node left = Ksmallest(node.left, data);
		if(left != null) { // this one will get the smallest num if there is a number
			return left;
		}
		count++;
		if(count == data) { // if the count is = data basically it cant go forward anymore 
			return node;
		}
		return Ksmallest(node.right, data); // if both situation not working, it will start going to the right side
	}
	public void printK(Node node, int data) {
		count = 0;
		Node ans = Ksmallest(node, data);
		if(ans == null) {
			System.out.println("No answer found!!!");
		}else {
			System.out.println("K Smallest element is: " + ans.data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {20, 8, 22, 4, 12, 10, 14};
		tree_smallest_Kth tree = new tree_smallest_Kth();
		for(int x: num) {
			tree.add(x);
		}
		int k = 3;
		tree.printK(tree.root, k);
	}

}
