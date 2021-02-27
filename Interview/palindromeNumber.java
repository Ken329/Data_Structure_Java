package Interview;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 120;
		int reversedInteger = 0, remainder = 0, originalInteger = num;
		while(num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}
		if(reversedInteger == originalInteger) {
			System.out.println(originalInteger + " is a palindrome number");
		}else {
			System.out.println(originalInteger + " is not a palindrome number");
		}
	}

}
