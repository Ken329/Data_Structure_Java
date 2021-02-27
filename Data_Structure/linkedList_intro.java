package Data_Structure;

import java.util.LinkedList;

public class linkedList_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first in first out
		LinkedList<Integer> link = new LinkedList<>();
		link.add(2);
		link.add(11);
		link.add(4);
		link.add(1);
		link.add(9);
		
		System.out.println("Link : " + link);
		System.out.println("First element : " + link.getFirst());
		System.out.println("Last element : " + link.getLast());
		System.out.println(link.get(2));
	}

}
