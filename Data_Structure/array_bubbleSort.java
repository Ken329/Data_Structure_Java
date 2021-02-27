package Data_Structure;
import java.util.*;
public class array_bubbleSort {
	public void bubbleSort(int[] num) {
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
	public void print(int[] num) {
		System.out.print("Elements: ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(30);
		}
		array_bubbleSort a = new array_bubbleSort();
		a.print(num);
		a.bubbleSort(num);
		a.print(num);
	}

}
