package Interview;
import java.util.*;
import java.util.Arrays;
public class secondLargest {
	public int second(int[] num) {
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num[num.length - 2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many number you want to input :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		System.out.println("Enter your number :");
		for(int i = 0; i < capa; i++) {
			num[i] = input.nextInt();
		}
		secondLargest sl = new secondLargest();
		System.out.println(sl.second(num));
	}

}
