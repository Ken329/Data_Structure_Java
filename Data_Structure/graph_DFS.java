package Data_Structure;
import java.util.*;
public class graph_DFS {
	public LinkedList<Integer> num[];
	public int v;
	public graph_DFS(int data) {
		this.v = data;
		num = new LinkedList[v];
		for(int i= 0;i < num.length; i++) {
			num[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int v, int w) {
		num[v].add(w);
	}
	public void print() {
		for(int i = 0; i < num.length; i++) {
			System.out.print("All Element of " + i + " : ");
			for(int j = 0; j < num[i].size(); j++) {
				System.out.print(num[i].get(j) + " ");
			}
			System.out.println();
		}
		
	}
	public void DFS(int data) {
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		visited[data] = true;
		q.add(data);
		while(!q.isEmpty()) {
			data = q.poll();
			System.out.print(data+ " ");
			Iterator<Integer> it = num[data].listIterator();
			while(it.hasNext()) {
				int n = it.next();
				if(!visited[n]) {
					visited[n] = true;
					q.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph_DFS g = new graph_DFS(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
		g.DFS(2);
	}

}
