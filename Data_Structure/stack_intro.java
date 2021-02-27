package Data_Structure;
import java.util.*;
public class stack_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// last in first out concept
		// pop will remove the last element who just got in
		// peek help to get the top element
		Stack<Integer> s = new Stack<>();
		s.add(12);
		s.add(4);
		s.add(3);
		s.add(9);
		System.out.println(s);
		int remove = s.pop();
		System.out.println("Remove: " + remove);
		System.out.println(s);
		System.out.println("First element :" + s.peek());
		System.out.println("Is empty: " + s.isEmpty());
	}

}
