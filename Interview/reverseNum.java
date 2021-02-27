package Interview;
import java.util.*;
public class reverseNum {
	public int[] reverse(int[] num) {
		int[] revNum = new int[num.length];
		int a = -1;
		for(int i = num.length - 1; i >= 0; i--) {
			a++;
			revNum[a] = num[i];
		}
		return revNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your capacity :");
		int capa = input.nextInt();
		int [] num = new int[capa];
		for(int i = 0; i < capa; i++) {
			num[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(num));
		reverseNum rn = new reverseNum();
		System.out.println(Arrays.toString(rn.reverse(num)));
	}

}
