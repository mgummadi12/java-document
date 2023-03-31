package collection;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
	//Hash stores the unique data in random order 
//linkledHash  stores the unique data but sequentially
//Hash and linked set both will accept null value
//Tree set accepts the unique data also maintaine in accending order 
//it never accept null and throw the null exception
		
  Set<String> list = new HashSet<String>();
		list.add("maha");
		list.add("reshma");
		list.add("pinky");
		list.add(null);
		
		System.out.println(list);

	}

}
