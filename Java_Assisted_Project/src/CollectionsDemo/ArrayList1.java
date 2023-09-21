package CollectionsDemo;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>cities=new ArrayList<>();
		cities.add("London");
		cities.add("Hyderabad");
		cities.add(1,"Delhi");
		
		System.out.println(cities.size());
		System.out.println(cities);
		for(String t :cities) {
			System.out.println(t);
		}
		
	}

}
