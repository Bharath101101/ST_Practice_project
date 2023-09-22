package CollectionsDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>td=new HashMap<>();
		td.put(12345, "Jarvis"); 
		td.put(1234, "Hawk"); 
		td.put(123, "Simba");
		td.put(12, "Friday"); 
		for(Entry<Integer, String> m: td.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		System.out.println(td.containsKey(1234));
		

	}

}
