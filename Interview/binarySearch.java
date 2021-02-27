package Interview;
import java.util.*;
public class binarySearch {
	public void quickSort(int[] num, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = num[(left+right)/2];
		int index = partition(num, left, right, pivot);
		quickSort(num, left, index - 1);
		quickSort(num, index, right);
	}
	public int partition(int num[], int left, int right, int pivot) {
		while(left <= right) {
			while(num[left] < pivot) {
				left++;
			}
			while(num[right] > pivot) {
				right--;
			}
			if(left <= right) {
				num = swap(num, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	public int[] swap(int num[] , int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
		return num;
	}
	public void search(int data, int[] num) {
		int low = 0;
		int high = num.length - 1;
		while(low < high) {
			int mid = (low + high)/2;
			if(num[mid] < data) {
				low = mid + 1;
			}else if(num[mid] > data) {
				high = mid - 1;
			}else {
				System.out.println("Found you data" + data + "at index " + mid);
				low = high + 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4, 8, 1, 9, 3, 6, 7};
		System.out.println(Arrays.toString(num));
		binarySearch n = new binarySearch();
		n.quickSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));
		n.search(6, num);
	}

}
