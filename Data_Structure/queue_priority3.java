package Data_Structure;
import java.util.*;
public class queue_priority3 {
	public static class detail implements Comparable<detail>{
		private String name;
		private int age;
		private double cgpa;
		public detail(String n, int a, double c) {
			this.name = n;
			this.age = a;
			this.cgpa = c;
		}
		public String toString() {
			return "Name: " + name + " Age: " + age + " CGPA: " + cgpa;
		}
		@Override
		public int compareTo(detail d) { // this functoin need to combine with collection.sort
			if(this.cgpa > d.cgpa) {
				return -1;
			}else {
				return 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<detail> mydetail = new ArrayList<>();
		mydetail.add(new detail("ken", 20, 3.9));
		mydetail.add(new detail("asand", 14, 4.0));
		mydetail.add(new detail("kelveen", 19, 3.8));
		mydetail.add(new detail("suriya", 43, 3.6));
		mydetail.add(new detail("lashween", 21, 3.7));
		
		Collections.sort(mydetail); // is to activate the compareTo function
		
		for(detail d : mydetail) {
			System.out.println(d);
		}
	}

}
