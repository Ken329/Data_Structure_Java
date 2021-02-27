package Data_Structure;

import java.util.Arrays;
import java.util.Random;

public class dataStructure_sort {
	int[] num = new int[10];
	static int myNum;
	Random rant = new Random();
	
	public void bubbleSort() {
		for(int i = 0; i < num.length; i++) {
			num[i] = rant.nextInt(50);
		}
		myNum = num[3];
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
	public void binarySearch(int value) {
		int lowIndex = 0; 
		int highIndex = num.length - 1;
		
		while(lowIndex <= highIndex) {
			int middleIndex = (lowIndex + highIndex) / 2;
			
			if(num[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			}else if(num[middleIndex] > value) {
				highIndex = middleIndex - 1;
			}else {
				System.out.println("Found a match value " + value + " at index " + middleIndex);
				lowIndex = highIndex + 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataStructure_sort ds = new dataStructure_sort();
		ds.bubbleSort();
		ds.binarySearch(myNum);
	}

}
