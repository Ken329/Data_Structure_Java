package Interview;
import java.util.*;
import java.util.Map.Entry;
public class interviewQ3 {
	public void check(int[] num, int sum) {
		boolean check = true;
		HashMap<Integer, Integer> myNum = new HashMap<>();
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] + num[j] == sum) {
					myNum.put(num[i], num[j]);
				}
			}
		}
		if(myNum.isEmpty()) {
			check = false;
		}
		if(check == false) {
			System.out.println(check);
		}else {
			System.out.println(check);
			for(Entry<Integer, Integer> entry : myNum.entrySet()) {
				System.out.println(entry.getKey() + " + " + entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many number your want to insert :");
		int capa = input.nextInt();
		int[] num = new int[capa];
		
		System.out.println("Insert youor numbers :");
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		
		System.out.print("Enter your sum :");
		int sum = input.nextInt();
		
		interviewQ3 iq = new interviewQ3();
		iq.check(num, sum);
	}

}
