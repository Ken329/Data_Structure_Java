package Data_Structure;
import java.util.*;
public class graph_intro {
	// easy to implement
	// removing edge only cost O(1) time/ constant time
	// want to track the edge also took O(1) time/ constant time
	// pros - it took more place and capacity 
	// it is an undirected graph, can be apply for BFS, DFS and connected component
	public static class graph{
		int v;
		LinkedList<Integer> num[];
		public graph(int data) {
			v = data;
			num = new LinkedList[v];
			for(int i = 0; i < num.length; i++) {
				num[i] = new LinkedList<Integer>();
			}
		}
		public void add(int v, int w) {
			num[v].add(w);
			num[w].add(v);
		}
		public void print() {
			for(int i = 0; i < num.length; i++) {
				System.out.print("Vertex " + i + ": ");
				for(int j = 0; j < num[i].size(); j++) {
					System.out.print(num[i].get(j) + " -> ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph(5);
		g.add(0, 2);
		g.add(0, 1);
		g.add(1, 3);
		g.add(0, 3);
		g.add(2, 4);
		g.add(3, 4);
		g.print();
	}

}
