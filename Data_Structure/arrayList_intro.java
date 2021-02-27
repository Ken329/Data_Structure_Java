package Data_Structure;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array list is easy to find element
		// array list is a dynamic array which very easy to resize
		// pros : easy to resize compare to normal array, it runs faster than linked list
		// cons : hard to insert or delete the element, it is harder to organize element 
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(1);
		num.add(32);
		num.add(10);
		num.add(6);
		
		System.out.println("Elements :" + num);
		num.remove(0); // remove index 0
		for(int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			if(it.next() == 10) {
				it.remove();
			}
		}
		System.out.println(num);
	}

}
