package Interview;
import java.util.*;
public class filterDisplay {
	public PriorityQueue<String> A_to_Z(String[] c) {
		PriorityQueue<String> pc = new PriorityQueue<>();
		for(int i = 0; i < c.length; i++) {
			pc.add(c[i]);
		}
		return pc;
	}
	public String[] Z_to_A(String[] c) {
		PriorityQueue<String> pc = new PriorityQueue<>();
		Stack<String> s = new Stack<>();
		pc = A_to_Z(c);
		s.addAll(pc);
		for(int i = 0; i < c.length; i++) {
			c[i] = s.pop();
		}
		return c;
	}
	public String[] startWith(String[] word, char c) {
		Queue<String> temp = new LinkedList<>();
		PriorityQueue<String> pc = new PriorityQueue<>();
		pc = A_to_Z(word);
		while(true) {
			if(pc.peek().charAt(0) == c) {
				break;
			}else {
				temp.add(pc.poll());
			}
		}
		String[] ans = new String[word.length];
		int a = 0;
		while(pc.size() != 0) {
			ans[a] = pc.poll();
			a++;
		}
		while(temp.size() != 0){
			ans[a] = temp.poll();
			a++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"ken", "suriya", "asfand", "lashween", "kelveen"};
		System.out.println("Normal form: " + Arrays.toString(word));
		filterDisplay fd = new filterDisplay();
		System.out.println("A to Z form: " +fd.A_to_Z(word));
		System.out.println("Z to A form: " +Arrays.toString(fd.Z_to_A(word)));
		System.out.println("Start with: " + Arrays.toString(fd.startWith(word, 's')));
	}

}
