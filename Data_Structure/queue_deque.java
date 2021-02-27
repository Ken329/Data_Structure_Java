package Data_Structure;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class queue_deque {

	public static void main(String[] args) {
		// deque allow the user to get the value more easily 
		// you can either get from the front, or from the back
		Deque<Integer> dq = new LinkedList<>(); // deque allow the user to get the data easily 
		dq.add(2);
		dq.add(32);
		dq.add(54);
		dq.add(1);
		System.out.println("\n  Deque  ");
		System.out.println(dq);
		dq.addFirst(32); // add one number at the first 
		System.out.println(dq);
		dq.addLast(43); // add one number at the last
		System.out.println(dq);
		int dqRemove = dq.remove();
		System.out.println("Remove : " + dqRemove);
		System.out.println(dq);
		Iterator<Integer> it = dq.descendingIterator(); // this void allow deque to display in decending order
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
