package Data_Structure;
import java.util.*;
public class queue_stackImplement {
	// stack normally should always pop out the last value 
	// but stack implement queue the stack now pop out the first element
	public static class queue{
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		public void enQueue(int data) { // this function helps to rotate the data from the back to the top
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		public int deQueue() {
			int x = s1.peek();
			s1.pop();
			return x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		q.enQueue(21);
		q.enQueue(3);
		q.enQueue(1);
		
		System.out.println("Dequeue: " + q.deQueue());
	}

}
