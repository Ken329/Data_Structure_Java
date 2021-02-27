package Data_Structure;

public class array_stack {
	public static class stack{
		int capa = 2;
		int[] stack = new int[capa];
		int top = 0;
		public void push(int data) {
			if(size() == capa) { 
				expand();
			}
			stack[top] = data;
			top++;
			
		}
		private void expand() {
			// this function allow the array became a dynamic array, it times the array size when it is full
			int length = size();
			int[] newStack = new int[capa*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
			capa *= 2;
		}
		public int pop() {
			// your need to decrease your top, top value already plus 1 
			int data;
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
			return data;
		}
		private void shrink() {
			// this method is to help you to reduce your size of array, when you pop more than3/4 it will skrink your array size 
			int length = size();
			if(length <= (capa/2)/2) {
				capa /= 2;
			}
			int[] newStack = new int[capa];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
		}
		public void show() {
			for(int i = 0; i < stack.length; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
		public int peek() {
			return stack[top - 1];
		}
		public int size() {
			// top value basically is your number that you have, it is the last value index you got
			return top;
		}
		public boolean isEmpty() {
			boolean check = false;
			if(stack[0] == 0) {
				check = true;
			}
			return check;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(19);
		s.push(21);
		s.push(7);
		s.push(10);
		s.push(10);
		s.show();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.show();
		System.out.println("Top : " + s.peek());
		System.out.println("Is Empty : " + s.isEmpty());
	}

}
