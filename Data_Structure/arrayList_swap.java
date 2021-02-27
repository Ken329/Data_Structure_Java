package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_swap {
	public ArrayList<Integer> swap(int index1, int index2, ArrayList<Integer> num) {
		int temp = num.get(index1);
		num.set(index1, num.get(index2));
		num.set(index2, temp);
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(6);
		num.add(9);
		num.add(21);
		num.add(32);
		System.out.println("Before Swap : " + num);
		Collections.swap(num, 2, 4);
		// from index 2 to index 4
		System.out.println("After Swap : " + num);
		arrayList_swap as = new arrayList_swap();
		System.out.println("Manual Swap : " + as.swap(1, 3, num));
		// index 1 to index 3
	}

}
