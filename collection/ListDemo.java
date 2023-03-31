package collection;
import java.util.*;

public class ListDemo {

	public static void main(String[] args)
	{
  
	List<String>list = new LinkedList<String>();
	
		
		list.add("maha");
		list.add("lucky");
		list.add("sruthi");
		
		list.add("maha");
		list.add("lucky");
		list.add("sruthi");
	    
	    
		System.out.println(list);
		
		Collections.sort(list);
		}
	}


