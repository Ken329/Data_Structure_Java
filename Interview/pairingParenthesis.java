package Interview;
import java.util.*;
public class pairingParenthesis {
	public boolean check(String word) {
		Stack<Character> s = new Stack<>();
		for(int i = 0; i < word.length(); i++) {
			char x = word.charAt(i);
			if(x == '(' || x == '[' || x == '{') {
				s.push(x);
				continue;
			}
			switch(x) {
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
			}
		}
		return s.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "{([])}";
		pairingParenthesis pair = new pairingParenthesis();
		if(pair.check(word)) {
			System.out.println("Your word is parenthesis");
		}else {
			System.out.println("Your word is not parenthesis");
		}
	}

}
