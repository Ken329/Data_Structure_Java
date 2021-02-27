package Data_Structure;
import java.util.*;
public class array_quickSort {
	// quick sort dividing an array in a subarray, it help the sorting array function runs smoother 
	public void quickSort(int[] num, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = num[(left+right) / 2];
		int index = partition(num, left, right, pivot); // this index find out the middle value between both side of the array
		quickSort(num, left, index-1); // it will start swapping from the left hand side
		quickSort(num, index, right); // it will start swapping from the right hand side
	}
	public int partition(int[] num, int left, int right, int pivot) {
		while(left <= right) {
			while(num[left] < pivot) { // if the left hand side number is smaller than just go on 
				left++;
			}
			while(num[right] > pivot) { // if the right hand side number is smaller than just go on 
				right--;
			}
			if(left <= right) {
				num = swap(num, left, right); // while it both stops which mean num[left] is bigger than pivot while
				left++;                       // num[right] is smaller than pivot and it will both swap
				right--;
			}
		}
		return left;
	}
	public int[] swap(int[] num, int left, int right) {
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50);
		}
		array_quickSort a = new array_quickSort();
		System.out.println(Arrays.toString(num));
		a.quickSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));
	}

}
