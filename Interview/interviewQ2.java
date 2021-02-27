package Interview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class interviewQ2 {
	public void plus(int[] num, int sum) {
		HashMap<Integer, Integer> ans = new HashMap<>();
		int[] mySum = new int[3];
		sum -= 1;
		for(int i = 0; i < mySum.length; i++) {
			mySum[i] = sum++;
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				for(int k = 0; k < mySum.length; k++) {
					if(num[i] + num[j] == mySum[k]) {
						ans.put(num[i], num[j]);
					}
				}
			}
		}
		System.out.print("The range is ");
		for(int i = 0; i < mySum.length; i++) {
			System.out.print(mySum[i] + ", ");
			while(i == 2) {
				System.out.println();
				break;
			}
			continue;
		}
		for(Entry<Integer, Integer> myNum : ans.entrySet()) {
			System.out.println(myNum.getKey() + " + " + myNum.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many number :");
		int capa = input.nextInt();
		int[] num = new int[capa];	
		
		System.out.println("Enter your number :");
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		
		System.out.print("Enter your sum :");
		int sum = input.nextInt();
		
		interviewQ2 iq = new interviewQ2();
		iq.plus(num, sum);
	}
}
