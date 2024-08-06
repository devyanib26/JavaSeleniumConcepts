package javaBasics.ListSetMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Amol Palekar");
		list1.add("Finance");
		list1.add("Developer");
		list1.add("Java");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Sonal");
		//list2.add("");
		list2.add("Tester");
		list2.add("Selenium");
		
		map.put(1, list1);
		map.put(2, list2);
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(1).get(2));
		
		
	}

}
