package Data_Structure;
import java.util.*;
public class queue_priority2 {
	// this priority queue has the same rules as queue 
	// it will peek the head element in the queue, and poll the head element from the queue
	// it has different with the normal queue, it will help you priority which element more important and put them at the back  
	// for string it will automatically sort from a to z for you 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> prio = new PriorityQueue<>();
		PriorityQueue<String> prios = new PriorityQueue<>();
		prio.add(32);
		prio.add(12);
		prio.add(2);
		prio.add(6);
		System.out.println(prio);
		System.out.println("First element: " + prio.peek());
		int remove = prio.poll();
		System.out.println("Remove: " + remove);
		System.out.println(prio);
		System.out.println();
		
		prios.add("ken");
		prios.add("asfand");
		prios.add("haha");
		prios.add("yoy");
		System.out.println(prios);
		System.out.println("First element: " + prios.peek());
		String removes = prios.poll();
		System.out.println("Remove: " + removes);
		System.out.println(prios);
	}

}
