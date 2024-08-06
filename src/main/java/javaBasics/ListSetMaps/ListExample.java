package javaBasics.ListSetMaps;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<>();
		
		obj.add("Pune");
		obj.add("Jaipur");
		obj.add("Jaipur");
		obj.add("Mumbai");
		obj.add("Aurangabad");
		obj.add("Nasik");
		obj.add("Indore");
		obj.add("Mumbai");

		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(5);
		System.out.println("Size of ArrayList: "+ obj.size());
		System.out.println("Contains : "+ obj.contains("Delhi"));
		System.out.println("Index OF "+ obj.indexOf("Jaipur"));
		System.out.println("Get value at given Index: "+ obj.get(4));
		System.out.println("Sub List: "+ obj.subList(2,6));
		
		List<String> newList = obj.subList(0,3);
		System.out.println(newList);
		newList.add("Delhi");
		System.out.println("Size of ArrayList: "+newList.size());
		newList.remove(0);
		//newList.clear();
		System.out.println(newList);
		
		
		for (int i=0; i< obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		
		System.out.println(" ============= Enhanced FOR LOOP =============");
		//foreach +ctrl+space
		for (String value : newList) {
			System.out.println(value);
			
		}
	}

}
