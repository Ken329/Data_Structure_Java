package Data_Structure;
import java.util.*;
public class tree_mergeTwoTree {
	// by implementing array list that helps me to merge both tree
	// the time complexity is better than the rest of the solution 
	// even though without sorted
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left =  null;
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
			}else {
				focus = focus.right;
				if(focus == null) {
					parent.right = new Node(data);
					return;
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
	public ArrayList<Integer> conv(Node node){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = store(node, list1);
		return list2;
	}
	public ArrayList<Integer> store(Node node, ArrayList<Integer> list){
		if(node == null) {
			return list;
		}
		store(node.left, list);
		list.add(node.data);
		store(node.right, list);
		return list;
	}
	public ArrayList<Integer> mergeArray(ArrayList<Integer> list1, ArrayList<Integer> list2, int s1, int s2){
		ArrayList<Integer> list3 = new ArrayList<>();
		int a = 0;
		int b = 0;
		while(a < s1 && b < s2) {
			if(list1.get(a) < list2.get(b)) {
				list3.add(list1.get(a));
				a++;
			}else {
				list3.add(list2.get(b));
				b++;
			}
		}
		while(a < s1) {
			list3.add(list1.get(a));
			a++;
		}
		while(b < s2) {
			list3.add(list2.get(b));
			b++;
		}
		return list3;
	}
	public Node convToTree(ArrayList<Integer> list1, int min, int max) {
		if(min > max) {
			return null;
		}
		int mid = (min + max) / 2; // basically this list is already sorted
		Node node = new Node(list1.get(mid)); // once i store the mid number as the root
		node.left = convToTree(list1, min, mid - 1); // the first half will always smaller than the root and store at the left
		node.right = convToTree(list1, mid + 1, max); // while the second half is always bigger than the root and store at the right
		return node;
	}
	public Node mergeTree(Node n1, Node n2) {
		ArrayList<Integer> list1 = conv(n1); // here i insert all the data into the array list sorted 
		ArrayList<Integer> list2 = conv(n2);
		ArrayList<Integer> list3 = mergeArray(list1, list2,  list1.size(), list2.size()); // here is the step i convery both arraylist
		Node node = convToTree(list3, 0, list3.size() - 1); // here i convert array list to tree
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_mergeTwoTree tree = new tree_mergeTwoTree();
		tree_mergeTwoTree tree1 = new tree_mergeTwoTree();
		tree.add(12);
		tree.add(3);
		tree.add(6);
		tree.add(14);
		tree.add(16);
		tree.show(tree.root);
		System.out.println();
		
		tree1.add(32);
		tree1.add(18);
		tree1.add(5);
		tree1.add(41);
		tree1.add(27);
		tree.show(tree1.root);
		System.out.println();
		
		tree.root = tree.mergeTree(tree.root, tree1.root);
		tree.show(tree.root);
		System.out.println();
	}

}
