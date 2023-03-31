package collection;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Android",15000);
		map.put("iphone",15000);
		map.put("nokia",15000);
		
		System.out.println(map);
		
		//System.out.println(map.keySet());
	//	System.out.println(map.values());
	Set set = map.entrySet();
	Iterator itr = set.iterator();
	
	while(itr.hasNext());
	{
		System.out.println(itr.next());
	}
	}

}
