package Data_Structure;
import java.util.*;
public class stack_balanceParent {
	public boolean check(String word) {
		// to check if the bracket is open and closing well or not 
		Stack<Character> s = new Stack<>();
		
		for(int i = 0; i < word.length(); i++) {
			char x = word.charAt(i);
			if(x == '(' || x == '{' || x == '[') { // when every bracket that is opening will be push inside
				s.add(x);
				continue;
			}
			if(s.isEmpty()) {
				return false;
			}
			switch(x) { // is to recognize the closing bracket, and see it meet the latest open bracket,
						// is not it will return false because it doesnt meet 
			case ')':
				if(s.peek() != '(') {
					return false;
				}else {
					s.pop();
				}
				break;
			case '}':
				if(s.peek() != '{') {
					return false;
				}else {
					s.pop();
				}
				break;
			case ']':
				if(s.peek() != '[') {
					return false;
				}else {
					s.pop();
				}
				break;
			}
		}
		return s.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your word: ");
		String word = input.next();
		
		stack_balanceParent s = new stack_balanceParent();
		if(s.check(word)) {
			System.out.println("This word is balanced");
		}else {
			System.out.println("This word is not balance");
		}
		
		input.close();
	}

}
