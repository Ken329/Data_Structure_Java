package Data_Structure;
import java.util.*;
public class tree_printWithRange {
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
			while(true){
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
	public ArrayList<Integer> storing(Node node) { // here is to proceed the recursive storing 
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		num2 = store(node, num1);
		return num2;
	}
	public ArrayList<Integer> store(Node node, ArrayList<Integer> num) {
		if(node != null) {
			store(node.left, num);
			num.add(node.data);
			store(node.right, num);
		}
		return num;
	}
	public void showRange(int r1, int r2) {
		ArrayList<Integer> num = storing(root);
		for(int x : num) {
			if(x > r1 && x < r2) { // will only print the data which is in the middle of the range
				System.out.print(x + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_printWithRange tree = new tree_printWithRange();
		tree.add(22);
		tree.add(10);
		tree.add(4);
		tree.add(30);
		tree.add(25);
		tree.add(14);
		tree.show(tree.root);
		System.out.println();
		tree.showRange(3, 20);
	}

}
