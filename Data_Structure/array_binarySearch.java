package Data_Structure;
import java.util.*;
public class array_binarySearch {
	public int[] bubbleSort(int[] num) {
		for(int i=  0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j] ;
					num[j] = temp;
				}
			}
		}
		return num;
	}
	public void binarySearch(int[] num, int a) {
		num = bubbleSort(num);
		int low = 0;
		int high =  num.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(num[mid] < a) {
				low = mid+1;
			}else if(num[mid] > a) {
				high = mid - 1;
			}else {
				System.out.println("Your number " + a + " at index " + mid);
				low = high + 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50);
		}
		int promt = num[3];
		array_binarySearch a = new array_binarySearch();
		System.out.println(Arrays.toString(a.bubbleSort(num)));
		a.binarySearch(num, promt);
	}

}
