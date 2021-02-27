package Data_Structure;

public class tree_search {
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
	public void show(Node node){
		if(node != null) {
			show(node.left);
			System.out.print(node.data + " ");
			show(node.right);
		}
	}
	public int search(int data) {
		Node focus = root;
		int ans = 0;
		while(true) {
			if(data < focus.data) {
				focus = focus.left;
			}else if(data > focus.data){
				focus = focus.right;
			}else {
				if(data == focus.data) {
					ans = 1;
					return ans;
				}else {
					return ans;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_search tree = new tree_search();
		tree.add(32);
		tree.add(12);
		tree.add(54);
		tree.add(45);
		tree.add(8);
		tree.add(29);
		tree.show(tree.root);
		System.out.println();
		System.out.println("Searching: " + tree.search(54));
	}

}
