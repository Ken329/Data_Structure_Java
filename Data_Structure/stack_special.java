package Data_Structure;
import java.util.*;
public class stack_special {
	static Stack<Integer> num = new Stack<>();
	public int getMin() {
		int temp = num.peek();
		for(int x : num) {
			if(temp > x) {
				temp = x;
			}
		}
		return temp;
	}
	public int getMax() {
		int temp = num.peek();
		for(int x : num) {
			if(temp < x) {
				temp = x;
			}
		}
		return temp;
	}
	public void pop(int times) { // the special pop allow you to pop more than 1 time in a row
		if(times > num.size()) {
			System.out.println("You stack do not contain this much elements");
		}else {
			for(int i = 0; i < times; i++) {
				num.pop();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num.add(12);
		num.add(32);
		num.add(3);
		num.add(8);
		num.add(26);
		num.add(26);
		num.add(6);
		num.add(16);
		System.out.println("Elements: " + num);
		stack_special ss = new stack_special();
		System.out.println("Minimum value: " + ss.getMin());
		System.out.println("Minimum value: " + ss.getMax());
		ss.pop(3); // pop 3 times
		System.out.println("Elements: " + num);
		System.out.println("Minimum value: " + ss.getMin());
		System.out.println("Minimum value: " + ss.getMax());
	}

}
