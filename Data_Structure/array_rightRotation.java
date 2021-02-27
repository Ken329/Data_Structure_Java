package Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class array_rightRotation {
	public int[] sort(int[] num, int firnum) {
		for(int i = 0; i < firnum; i++) {
			int first = num[0];
			int j;
			for(j = 0; j < num.length - 1; j++) {
				num[j] = num[j + 1];
			}
			num[j] = first;
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0;
		int[] num = new int[5];
		for(int i = 1; i < 6; i++) {
			num[a] = i;
			a++;
		}
		System.out.println(Arrays.toString(num));
		System.out.print("Which number you want to rotate: ");
		int firnum = input.nextInt();
		
		array_rightRotation ar = new array_rightRotation();
		System.out.print(Arrays.toString(ar.sort(num, firnum)));
		
		input.close();
	}

}
