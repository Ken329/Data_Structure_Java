package Data_Structure;
import java.util.*;
public class queue_priority {
	public static class student implements Comparable<student>{
		private String name;
		private int rank;
		public student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
		public String toString() {
			return "Name: " + name + "\nRank: " + rank;
		}
		@Override
		public int compareTo(student st) { // this compare function allow me to structure the the priority
			if(rank < st.rank) {
				return -1;
			}else if(rank > st.rank){
				return 1;
			}else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<student> s = new PriorityQueue<>();
		s.add(new student("Ken", 3));
		s.add(new student("Kelveen", 5));
		s.add(new student("Asfand", 4));
		s.add(new student("Lashween", 1));
		s.add(new student("Suriya", -1));
		
		Iterator<student> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(s.poll().toString()); // it will display form the e lesser priority to the highest one
		}
	}

}
