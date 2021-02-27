package Data_Structure;
import java.util.*;
public class graph_BFS {
	LinkedList<Integer> num[]; // basically this is an array with linkedlist inside
	int cap;
	public graph_BFS(int capa) {
		this.cap = capa;
		num = new LinkedList[cap];
		for(int i = 0; i < num.length; i++) {
			num[i] = new LinkedList(); // each of the capacity of the array has a new linkedlist
		}
	}
	public void addEdge(int v, int w) {
		num[v].add(w); // v is the location of the array, w is the value of it 
	}
	public void BFS(int data) {
		boolean[] visit = new boolean[cap]; // basically visit is to identity which of ours location not visited yet 
		Queue<Integer> q = new LinkedList<Integer>();
		visit[data] = true; // the first value becoming true 
		q.add(data);
		while(!q.isEmpty()) { 
			data = q.poll(); // always get the first result 
			System.out.print(data + " ");
			Iterator<Integer> it = num[data].listIterator(); // if the first location has child node
			while(it.hasNext()) {
				int n = it.next();
				if(!visit[n]) { // if the child value not visited, make the child value visited and add into queue
					visit[n] = true;
					q.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph_BFS g = new graph_BFS(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        g.BFS(2);
        
        //  0 - 1
        // || / 
        //  2 - 3
        //
		
	}

}
