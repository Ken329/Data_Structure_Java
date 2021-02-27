package Interview;
import java.util.*;
public class graph_breadthFirstSearch {
	public static class graph{
		int v;
		LinkedList<Integer> num[];
		public graph(int data) {
			this.v = data;
			num = new LinkedList[v];
			for(int i = 0; i < num.length; i++) {
				num[i] = new LinkedList<Integer>();
			}
		}
		public void add(int v, int w) {
			num[v].add(w); // v stand for the place you want to add, and w is the value
		}
		public void show() {
			for(int i = 0; i < num.length; i++) {
				System.out.print("Vertex " + i + ": ");
				for(int j = 0; j < num[i].size(); j++) {
					System.out.print(num[i].get(j) + " ");
				}
				System.out.println();
			}
		}
		public void BFS(int data) {
			boolean[] visit = new boolean[v];
			Queue<Integer> q = new LinkedList<>();
			visit[data] = true;
			q.add(data);
			while(!q.isEmpty()){
				data = q.poll();
				System.out.print(data + " ");
				Iterator<Integer> it = num[data].listIterator();
				while(it.hasNext()) {
					int n = it.next();
					if(!visit[n]) {
						visit[n] = true;
						q.add(n);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph(4);
		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 2);
		g.add(2, 3);
		g.add(3, 0);
		//g.show();
		g.BFS(3);
	}

}
