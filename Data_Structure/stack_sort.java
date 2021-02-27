package Data_Structure;
import java.util.*;
public class stack_sort {
	public void sort(Stack<Integer> num) {
		if(num == null || num.isEmpty()) {
			return;
		}
		Stack<Integer> newNum = new Stack<>();
		newNum.add(num.pop()); // pop the first number in num and add inside newNUm
		// num is empty which mean all the number already sorted and store inside newNum
		while(!num.isEmpty()) {
			int temp = num.pop();
			while(!newNum.isEmpty() && temp > newNum.peek()) { // while temp value is bigger than newNum peek, the loop will stop 
															   // and store the temp value inside the newNum, repeat it over and over again 
				num.add(newNum.pop());
			}
			newNum.add(temp);
		}
		for(int x : newNum) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("How many number yuo want to insert: ");
		int capa = input.nextInt();
		Stack<Integer> num = new Stack<>();
		for(int i = 0; i < capa; i++) {
			int nums = input.nextInt();
			num.add(nums);
		}
		
		stack_sort ss = new stack_sort();
		ss.sort(num);
		
		input.close();
	}

}
