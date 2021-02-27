package Data_Structure;

import java.util.*;
public class queue_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// queue is a normal list that will push element at the back the the new element will call as rear,
		// the first element will be front, will be pop 
		// first in first out, FIFO
		Queue<Integer> q = new LinkedList<>();
		q.add(12);
		q.add(3);
		q.add(54);
		q.add(6);
		System.out.println("  Queue  ");
		System.out.println(q);
		int remove = q.poll();
		System.out.println("Remove element: " + remove);
		System.out.println(q); // first element is out
		System.out.println("First element: " + q.peek());
		System.out.println("Is Empty: " + q.isEmpty());
	}

}
