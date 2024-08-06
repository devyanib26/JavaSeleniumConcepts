package javaBasics.ListSetMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, HashMap<Integer, ArrayList<String>>> map = new HashMap<>();
		// Key = Department
		HashMap<Integer, ArrayList<String>> map1 = new HashMap<>();
		ArrayList<String> list11 = new ArrayList<>();
		list11.add("Amol Palekar");
		list11.add("Finance");
		list11.add("Developer");
		list11.add("Java");
		
		ArrayList<String> list12 = new ArrayList<>();
		list12.add("Sonal");
		list12.add("");
		list12.add("Tester");
		list12.add("Selenium");
		
		map1.put(1, list11);
		map1.put(2, list12);
		
		HashMap<Integer, ArrayList<String>> map2 = new HashMap<>();
		ArrayList<String> list21 = new ArrayList<>();
		list21.add("Satyam Sharma");
		list21.add("Finance");
		list21.add("Developer");
		list21.add("ASP");
		
		ArrayList<String> list22 = new ArrayList<>();
		list22.add("Ojasvee");
		list22.add("Department");
		list22.add("Tester");
		list22.add("QTP");
		
		map2.put(1, list21);
		map2.put(2, list22);
		
		HashMap<Integer, ArrayList<String>> map3 = new HashMap<>();
		ArrayList<String> list31 = new ArrayList<>();
		list21.add("Satyam Sharma");
		list21.add("Finance");
		list21.add("Developer");
		list21.add("ASP");
		
		ArrayList<String> list32 = new ArrayList<>();
		list22.add("Ojasvee");
		list22.add("Department");
		list22.add("Tester");
		
		ArrayList<String> list33 = new ArrayList<>();
		list33.add("Ojasvee");
		list33.add("Department");
		list33.add("Department");
		list33.add("Tester");
		
		map3.put(1, list31);
		map3.put(2, list32);
		map3.put(3, list33);
		
		map.put("Department1", map1);
		map.put("Department2", map2);
		map.put("Department3", map3);
		
		System.out.println(map);
		System.out.println(map.get("Department2").get(1).get(4));
	}

}
