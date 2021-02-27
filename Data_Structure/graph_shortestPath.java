package Data_Structure;
import java.util.*;
public class graph_shortestPath {
	public static class graph{
		// is to count how many edge i need to pass through to get the number
		// i use queue to push all my numbers in it, and use array to track the numbers
		// and count the distance number 
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
		}
		public void print() {
			for(int i = 0; i < num.length; i++) {
				System.out.print("Vertex " + i + " : ");
				for(int j = 0; j < num[i].size(); j++) {
					System.out.print(num[i].get(j) + " ");
				}
				System.out.println();
			}
		}
		public void DFS(int s) {
			boolean[] visit = new boolean[v];
			Queue<Integer> q = new LinkedList<>();
			visit[s] = true;
			q.add(s);
			while(!q.isEmpty()) {
				s = q.poll();
				System.out.print(s + " ");
				Iterator<Integer> it = num[s].listIterator();
				while(it.hasNext()) {
					int n = it.next();
					if(!visit[n]) {
						visit[n] = true;
						q.add(n);
					}
				}
			}
		}
		public void search(int s, int e) {
			int[] distance = new int[num.length];
			Queue<Integer> q = new LinkedList<>();
			Arrays.fill(distance, -1);
			distance[s] = 0;
			q.add(s);
			int n = q.peek();
			Iterator<Integer> it = num[n].listIterator();
			while(it.hasNext()) {
				q.add(it.next());
			}
			while(!q.isEmpty()) {
				int p = q.poll();
				distance[p] = 0;
				if(p == e) {
					break;
				}
			}
			int count = 0;
			for(int i = 0; i < distance.length; i++) {
				if(distance[i] == 0) {
					count++;
				}
			}
			System.out.println("From " + s + " to " + e + " shortest distance is " + count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph(6);
		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 2);
		g.add(1, 3);
		g.add(2, 4);
		g.add(4, 3);
		g.add(4, 5);
		g.add(3, 5);
		g.DFS(0);
		System.out.println();
		g.search(0, 4);
		
		//       1 ---- 3 
		//     / |      | \
		//   0   |      |  5
		//     \ |      | /
		//       2 ---- 4
	}

}
