package Data_Structure;
import java.util.*;
public class array_findLargestK {
	public static void findK(int[] num, int length, int k) {
		int j , max;
		for(int i = 0; i < length - k; i++) {
			max = num[i];
			for(j = 1; j < k; j++) {
				if(num[i +j] > max) {
					max = num[i + j];
				}
				System.out.println("MAX: " + max);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your capacity: ");
			int capa = input.nextInt();
			int[] num = new int[capa];
			
			System.out.println("Enter your numbers: ");
			for(int i = 0; i < num.length; i++) {
				num[i] = input.nextInt();
			}
			
			findK(num, capa, 3);
			input.close();
		}catch(Exception e) {
			System.out.println("Please try again, do not type any leter or symbol");
		}	
	}
}
