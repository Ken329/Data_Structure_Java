package Interview;
import java.util.*;
public class findMissingNum_2Array {
	// to check which number is missing from array2 compare to array1
	public void find(int[] a1, int[] a2, int s1, int s2) {
		int[] fir= sort(a1);
		int[] sec = sort(a2);
		System.out.println("First array " + Arrays.toString(fir));
		System.out.println("Second array " + Arrays.toString(sec));
		System.out.println("Missing element is " + finding(fir, sec, s1));
	}
	public int finding(int[] a1, int[] a2, int n) {
		if(n == 1) { // it will return when the array length is 1 because only 1 number
			return a1[0];
		}
		if(a1[0] != a2[0]) { // it will return the first number is a1 because both of them dont have the same first number
			return a1[0];
		}
		int low = 0, high = n - 1;
		while(low < high) {
			int mid = (low+high)/2;
			if(a1[mid] == a2[mid]) {
				low = mid;
			}else {
				high = mid;
			}
			if(low == high - 1) {
				break;
			}
		}
		return a1[high];
	}
	public int[] sort(int[] num) {
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {4, 5, 1, 3, 10};
		int[] array2 = {4, 5, 1, 3};
		findMissingNum_2Array find = new findMissingNum_2Array();
		find.find(array1, array2, array1.length, array2.length);
	}

}
