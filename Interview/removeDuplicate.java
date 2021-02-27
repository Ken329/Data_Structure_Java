package Interview;
import java.util.Arrays;
import java.util.*;

public class removeDuplicate {
	public HashSet<Integer> remove(int[] num) {
		HashSet<Integer> hs = new HashSet<>(); 
		for(int i = 0; i < num.length; i++) {
			if(!hs.contains(num[i])) {
				hs.add(num[i]);
			}
		}
		return hs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your capacity :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		System.out.println("Insert your number :");
		for(int i = 0; i < capa; i++) {
			num[i] = input.nextInt();
		}
		removeDuplicate rd = new removeDuplicate();
		System.out.println("Before :" + Arrays.toString(num));
		System.out.println("After: " + rd.remove(num));
	}

}
