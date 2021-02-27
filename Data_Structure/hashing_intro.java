package Data_Structure;
import java.util.*;
import java.util.Map.Entry;
public class hashing_intro {
	// it has O(1) in insert, traversal and delete
	// HashMap - it can't store duplicate key
	// TreeMap - it basically sorted when you put your value in
	// LinkedListMap - it basically implement all the function of hashmap but having insertion order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> phone = new HashMap<>();
		phone.put("Ken", "0127022260");
		phone.put("Asfand", "012702232");
		phone.put("Kelveen", "01432422260");
		phone.put("Lashween", "012743460");
		phone.put("Suriya", "023422260");
		for(Entry<String, String> entry : phone.entrySet()) {
			System.out.println("Name: " + entry.getKey() + " and Phone number: " + entry.getValue());
		}
	}

}
