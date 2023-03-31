package collection;
import java.util.*;
public class listDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("maha");
		list.add("reshma");
		list.add("pinky");
		list.add(null);
		
		list.add("maha");
		list.add("reshma");
		list.add("pinky");
		list.add(null);
		
		System.out.println(list);
		
		for(String obj: list);
		{
	
			System.out.println();
		}


	}

}
