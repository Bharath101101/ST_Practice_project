package CollectionsDemo;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>cities=new LinkedList<>();
		cities.add("London");
		cities.add("Hyderabad");
		cities.add(1,"Delhi");
		
		System.out.println(cities.size());
		System.out.println(cities);
		
		Iterator<String> itr=cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(cities.get(1));
		System.out.println(cities.contains("North"));

	}

}
