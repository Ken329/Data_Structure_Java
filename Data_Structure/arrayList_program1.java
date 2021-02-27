package Data_Structure;

import java.util.ArrayList;

public class arrayList_program1 {
	ArrayList<String> num = new ArrayList<>();
	public void add(String data) {
		num.add(data);
	}
	public void remove(int index) {
		num.remove(index);
	}
	public void show() {
		System.out.println("Elements : " + num);
	}
	public int size() {
		int count = 0;
		for(String x : num) {
			count++;
		}
		return count;
	}
	public boolean search(String a) {
		boolean check = num.contains(a);
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList_program1 ap = new arrayList_program1();
		ap.add("Ken");
		ap.add("Asfand");
		ap.add("Kelveen");
		ap.add("Lashween");
		ap.show();
		ap.remove(3);
		ap.show();
		System.out.println("How many subcribers : " + ap.size());
		System.out.println(ap.search("Ken"));
	}

}
