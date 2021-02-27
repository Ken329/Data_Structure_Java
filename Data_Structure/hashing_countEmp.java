package Data_Structure;
import java.util.*;
import java.util.Map.Entry;
public class hashing_countEmp {
	public void count(Map<String, String> data) {
		Map<String, Integer> ans = new HashMap<String, Integer>();
		for(Entry<String, String> entry : data.entrySet()) {
			if(ans.containsKey(entry.getValue())) {
				ans.put(entry.getValue(), ans.get(entry.getValue()) + 1);
			}else {
				ans.put(entry.getValue(), 1);
			}
		}
		for(Entry<String, String> entry : data.entrySet()) {
			if(ans.containsKey(entry.getKey())) {
				ans.put(entry.getKey(), ans.get(entry.getKey()) + 1);
			}else {
				ans.put(entry.getKey(), 0);
			}
		}
		print(ans);
	}
	public void print(Map<String, Integer> data) {
		for(Entry<String, Integer> entry : data.entrySet()) {
			System.out.print(" " + entry.getKey() + " = " + entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the String at the right is the manager, while the left is the employee
		// calculate how many job the manager needs to do, while keeping the employee remaining 0
		Map<String, String> dataSet = new HashMap<String, String>(); 
        dataSet.put("A", "C"); 
        dataSet.put("B", "C"); 
        dataSet.put("C", "F"); 
        dataSet.put("D", "E"); 
        dataSet.put("E", "F"); 
        dataSet.put("F", "F"); 
        hashing_countEmp count = new hashing_countEmp();
        count.count(dataSet);
	}

}
