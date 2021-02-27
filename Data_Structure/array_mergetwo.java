package Data_Structure;
import java.util.*;
public class array_mergetwo {
	public int[] mergeTwoSort(int[] num1, int[] num2) {
		int[] ans = new int[num1.length+num2.length];
		int c = 0;
		for(int i = 0; i < num1.length; i++) {
			ans[c] = num1[i];
			c++;
		}
		for(int i = 0; i < num1.length; i++) {
			ans[c] = num2[i];
			c++;
		}
		for(int i = 0; i < ans.length; i++) {
			for(int j = i; j < ans.length; j++) {
				if(ans[i] > ans[j]) {
					int temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}
		return ans;
	}
	public static void binarySearch(int[] num) {
		// test perpose not running
		int value = 0;
		int left = 0;
		int right = num.length - 1;
		while(left <= right) {
			int middle = (left + right) / 2;
			if(num[middle] < value) {
				left = middle + 1;
			}else if(num[middle] > value) {
				right = middle - 1;
			}else {
				System.out.println("Value at index " + middle);
				left = right + 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[4];
		int[] num2 = new int[4];
		Random rant = new Random();
		for(int i = 0; i < num1.length; i++) {
			num1[i] = rant.nextInt(50);
		}
		for(int i = 0; i < num2.length; i++) {
			num2[i] = rant.nextInt(100);
		}
		System.out.println("Array 1 :" + Arrays.toString(num1));
		System.out.println("Array 2 :" + Arrays.toString(num2));
		array_mergetwo am = new array_mergetwo();
		System.out.println("Merge Array :" + Arrays.toString(am.mergeTwoSort(num1, num2)));
	}

}
