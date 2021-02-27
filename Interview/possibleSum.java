package Interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class possibleSum {
	public HashMap<Integer, Integer> possible(int[] num, int sum){
		int total = 0;
		HashMap<Integer, Integer> value = new HashMap<>();
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				total = num[j] + num[i];
				if(total == sum) {
					value.put(num[j], num[i]);
				}
			}
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many number you want to input :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		System.out.println("Enter you numbers :");
		for(int i = 0; i < capa; i++) {
			num[i] = input.nextInt();
		}
		System.out.println("Your sum is :");
		int sum = input.nextInt();
		
		possibleSum ps = new possibleSum();
		for(Entry<Integer, Integer> myEntry : ps.possible(num, sum).entrySet()) {
			System.out.println(myEntry.getKey() + " + " + myEntry.getValue());
		}
	}
}
