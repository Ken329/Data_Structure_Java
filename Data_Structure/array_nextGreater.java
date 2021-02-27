package Data_Structure;
import java.util.*;
public class array_nextGreater {
	public void greater(int[] num) {
		// when the array num dont have any number that is bigger than my number it will initialize it as 0
		int next = 0;
		System.out.println(Arrays.toString(num));
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]) {
					next = num[j];
					break;
				}else {
					next = 0;
				}
			}
			System.out.println(num[i] + " -- " + next);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many capacity: ");
		int capa = input.nextInt();
		int[] num = new int[capa];
		for(int i = 0; i < capa; i ++) {
			num[i] = input.nextInt();
		}
		
		array_nextGreater an = new array_nextGreater();
		an.greater(num);
		
		input.close();
	}

}
