package Data_Structure;
import java.util.*;
public class array_mergeSort {
	// merge sort basically just divided the whole array into a very smaller pieces of number
	// and start grouping them together with a ascending or descending order
	public void merge(int[] num, int left, int right) {
		if(left < right) {
			int mid = (right + left) / 2;
			merge(num, left, mid); // this merge is the first half of the array 
			merge(num, mid+1, right); // this merge is the second half of the array
			sorted(num, left, mid, right);
		}
	}
	public void sorted(int[] num, int left, int mid, int right) {
		int n1 = mid - left + 1; // first half size
		int n2 = right - mid; // second half size
		int[] l = new int[n1]; // temp array for first half
		int[] r = new int[n2]; // temp array for second half
		
		for(int i = 0; i < n1; i++) {
			l[i] = num[left + i]; // store all the first half value
		}
		for(int i = 0; i < n2; i++) {
			r[i] = num[mid+1 + i]; // store all the second half value
		}
		int i = 0, j = 0;
		int k = left;
		while(i < n1 && j < n2) {
			if(l[i] <= r[j]) { // if left value of small than right value
				num[k] = l[i]; // store the left value in the default array
				i++; // increment the size of left
			}else {
				num[k] = r[j];
				j++; // increment the vlue of right 
			}
			k++;
		}
		while(i < n1) { // while second half of the array has all been store
			num[k] = l[i]; // it will start storing all the remaining value inside
			i++;
			k++;
		}
		while(j < n2) {
			num[k] = r[j];
			j++;
			k++;
		}
	}
	public void swap(int[] num, int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(30);
		}
		System.out.println(Arrays.toString(num));
		array_mergeSort a = new array_mergeSort();
		a.merge(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));
	}

}
