package Interview;
import java.util.*;
public class vawelCal {
	public int calculate(String str) {
		String new_string = str.replaceAll(" ", "");
		int length = new_string.length();
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		int num = 0;
		for(int i = 0; i < length; i++) {
			char c = new_string.charAt(i);
			for(int j = 0; j < vowel.length; j++) {
				if(c == vowel[j]) {
					num++;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your words :");
		String str = input.nextLine();
		vawelCal vc = new vawelCal();
		System.out.println(vc.calculate(str));
	}

}
