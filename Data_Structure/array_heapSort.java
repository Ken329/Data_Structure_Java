package Data_Structure;
public class array_heapSort {
	// heap sort took O(log n) time complexity
	public void sort(int[] num) {
		int n = num.length;
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(num, n, i);
		}
		// put the biggest num to the back
		for(int i = n - 1; i >= 0; i--) {
			int temp = num[0];
			num[0] = num[i];
			num[i] = temp;
			
			heapify(num, i, 0);
		}
	}
	public void heapify(int[] num, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		// if left data is bigger than root
		if(l < n && num[l] > num[largest]) {
			largest = l;
		}
		// if right data is bigger than root
		if(r < n && num[r] > num[largest]) {
			largest = r;
		}
		// if largest is not the largest
		if(largest != i) {
			int temp = num[i];
			num[i] = num[largest];
			num[largest] = temp;
			
			heapify(num, n, largest);
		}
	}
	public void print(int[] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
	}
	public static void main(String[] args) {
		int[] num = {12, 11, 13, 5, 6, 7}; 
		array_heapSort array = new array_heapSort();
		array.sort(num);
		array.print(num);
	}
}
