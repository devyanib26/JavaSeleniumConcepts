package javaBasics.ListSetMaps;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Pune", 411014);
		map.put("Mumbai", 400001);
		map.put("Aurangabad", 431001);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.put("Jaipur",302001);
		System.out.println(map.size());
		map.replace("Pune", 411028);
		System.out.println(map);

		map.remove("Mumbai");
		System.out.println(map);

		System.out.println(map.containsKey("Nasik"));
		System.out.println(map.containsValue(302001));
		
		System.out.println(map.get("Punee"));
		
		map.put("Aurangabad", 123456);
		// put and replace work the similar way if key is already there.
		System.out.println(map);
		
		for (String key : map.keySet()) {
			System.out.println("City "+ key + " has PIN Code: "+ map.get(key));
		}
		
	}

}
