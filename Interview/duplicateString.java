package Interview;
import java.util.*;
import java.util.Map.Entry;
public class duplicateString {
	
	public void myWord(String str){
		HashMap<Character, Integer> word = new HashMap<>();
		char[] myChar = new char[str.length()];
		int flag = 1;
		for(int i = 0; i < str.length(); i++) {
			myChar[i] = str.charAt(i);
		}
		for(int i = 0; i < myChar.length; i++) {
			if(!word.containsKey(myChar[i])) {
				word.put(myChar[i], 1);
			}else {
				word.put(myChar[i], word.get(myChar[i]) + 1);
			}
		}
		for(Entry<Character, Integer> entry : word.entrySet()) { 
			if(entry.getValue() > 1) { 
				System.out.println(entry.getKey() + " : " + entry.getValue()); 
				flag = 0; 
			} 
		} 
		if(flag == 1) {
		  System.out.println("None of the characters is duplicate");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your string :");
		String word = input.nextLine();
		duplicateString ds = new duplicateString();
		ds.myWord(word);
	}

}
