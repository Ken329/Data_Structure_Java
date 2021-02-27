package Interview;
import java.util.*;
public class graph_depthFirstSearch {
	public static class graph{
		LinkedList<Integer> num[];
		int v;
		public graph(int data) {
			this.v = data;
			num = new LinkedList[v];
			for(int i = 0; i < num.length; i++) {
				num[i] = new LinkedList<Integer>();
			}
		}
		public void add(int v, int w) {
			num[v].add(w);
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
		public void DFS(int data) {
			boolean[] visit = new boolean[v];
			Stack<Integer> s = new Stack<>();
			visit[data] = true;
			s.push(data);
			while(!s.isEmpty()) {
				data = s.pop();
				System.out.print(data + " ");
				Iterator<Integer> it = num[data].listIterator();
				while(it.hasNext()) {
					int n = it.next();
					if(!visit[n]) {
						visit[n] = true;
						s.push(n);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph(5);
		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 3);
		g.add(2, 4);
		g.add(4, 0);
		g.add(3, 4);
		g.add(3, 1);
		//g.show();
		g.DFS(3);
	}

}
