package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class interviewQ1 {
	public int[] addNum(int[] num){
		int[] answer;
		for(int i = num.length - 1; i >= 1; i--) {
			if(num[i] > 8) {
				num[i] = 0;
				num[i - 1] += 1;
			}
		}
		if(num[0] == 10) {
			num[0] = 0;
			answer = new int[num.length + 1];
			answer[0] = 1;
			for(int i = 1; i < answer.length; i++) {
				answer[i] = num[i  - 1];
			}
		}else {
			answer = new int[num.length];
			for(int i = 0; i < answer.length; i++) {
				answer[i] = num[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many capacity you want to input :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		
		System.out.println("Insert your number :");
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] > 9) {
				test = 0;
				System.err.println("Error!!! Numbers to huge only accept number less than 10");
				break;
			}else {
				test = 1;
			}
		}
		if(test == 1) {
			interviewQ1 iq = new interviewQ1();
			System.out.println(Arrays.toString(iq.addNum(num)));

		}
	}

}
