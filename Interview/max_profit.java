package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class max_profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("How many number :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		int max;
		int min;
		int buy = 0;
		int sell = 0;
		String advise = null;
		System.out.println("Input your number :");
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		max = num[0];
		min = num[0];
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] == min) {
				buy = i+1;
			}
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] == max) {
				sell = i+1;
			}
		}
		System.out.println(Arrays.toString(num));
		if(sell < buy) {
			System.out.println("This stock is not woth to buy,too risky!!!");
		}else {
			System.out.println("Buy it on " + buy + "day aand sell it on " + sell + " day");
			int total = max - min;
			System.out.println("The max profit you can get is " + total);
		}
	}

}
