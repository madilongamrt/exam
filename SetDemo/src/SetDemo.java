import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// HashSet<String> set = new HashSet<String>();

		TreeSet<String> set = new TreeSet<String>();
		
		// Here data is not added as in indexing approach
		// its hashCodes for elements
		set.add("John");
		set.add("Jeneth");
		set.add("Albert");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		set.add("Joe");
		set.add("Becca");
		set.add("Kelvin");
		
		// data is unique no redundancy
		System.out.println("set is: " + set);
		
		// data is unordered in output due to hashing
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		
		//
	}

}
