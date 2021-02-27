package Data_Structure;
import java.util.*;
public class hashing_duplicateWithRange {
	public boolean check(int[] num, int k) {
		HashSet<Integer> ans = new HashSet<>();
		for(int i = 0; i < num.length; i++) {
			if(ans.contains(num[i])) {
				return true;
			}
			ans.add(num[i]);
			
			if(i >= k) { // while it reach k value, it will delete the first number of ans
				ans.remove(i - k);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 5, 3, 4, 3, 5, 6}; 
		hashing_duplicateWithRange hash = new hashing_duplicateWithRange();
		if(hash.check(num, 3)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
