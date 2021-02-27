package Interview;
import java.util.*;
public class missingNum {
	public void miss(int[] num) {
		int capa = num.length;
		int big;
		int small;
		int length;
		big = num[0];
		small = num[0];
		for(int i = 0; i < num.length; i++) {
			if(big < num[i]) {
				big = num[i];
			}
			if(small > num[i]) {
				small = num[i];
			}
		}
		length = big - small;
		int missing = 0;
		int a = 0;
		if(capa == length) {
			for(int i = small; i <= big; i++) {
				if(i != num[a]) {
					missing = i;
					break;
				}
				a++;
			}
			System.out.println(missing);
		}else {
			System.out.println("Your number is our of range pls check!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many number you want to insert :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		System.out.println("Please enter your number :");
		for(int i = 0; i < capa; i++) {
			num[i] = input.nextInt();
		}
		missingNum mn = new missingNum();
		mn.miss(num);
	}

}
