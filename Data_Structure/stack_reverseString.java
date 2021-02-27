package Data_Structure;
import java.util.*;
public class stack_reverseString {
	public String reverse(Stack<Character> s, int length) {
		// last in first out concept
		// so pop value will always be the last value of the string 
		// it allow you to reverse the string easily
		String ans = "";
		for(int i = 0; i < length; i++) {
			ans += s.pop();
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s = new Stack<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = input.next();
		for(int i = 0; i < word.length(); i++) {
			s.add(word.charAt(i));
		}
		stack_reverseString sr = new stack_reverseString();
		System.out.println(sr.reverse(s, word.length()));
		
		input.close();
	}

}
