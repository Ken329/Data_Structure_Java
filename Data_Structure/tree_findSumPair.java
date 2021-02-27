package Data_Structure;

public class tree_findSumPair {
	// this program is used to find the sum pair in the tree
	//  to match the time complexity i used store my sorted tree into the array
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static class findSum{
		Node root;
		int count = 0;
		int[] num = new int[5];
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
		public void inOrder(Node node) {
			if(node != null) {
				inOrder(node.left);
				System.out.print(node.data + " ");
				inOrder(node.right);
			}	
		}
		public int[] store(Node node) { // this function recursively helps me sorted my value and store into the array
			if(node != null) {
				store(node.left);
				num[count] = node.data;
				count++;
				store(node.right);
			}
			return num;
		}
		public void sum(int guess) { // here is to get the the guess result
			int[] ans = new int[2];
			int[] num = store(root);
			for(int i = 0; i < num.length; i++) {
				for(int j = i + 1; j < num.length; j++) {
					if(num[i] + num[j] == guess) {
						ans[0] = num[i];
						ans[1] = num[j];
					}
				}
			}
			if(ans[0] == 0) {
				System.out.println("No pair found!!!");
			}else {
				System.out.println("Answer: " + ans[0] + " + " + ans[1] + " = " + guess);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSum find = new findSum();
		find.add(21);
		find.add(7);
		find.add(15);
		find.add(33);
		find.add(41);
		find.inOrder(find.root);
		System.out.println();
		find.sum(36);
	}

}
