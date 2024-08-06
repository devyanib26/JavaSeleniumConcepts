package javaBasics.ListSetMaps;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("Pune");
		set.add("Mumbai");
		set.add("Jaipur");
		set.add("Indore");
		
		System.out.println(set);
		System.out.println(set.remove("Pune"));
		System.out.println(set);
		
		System.out.println(set.contains("Raipur"));
		
		System.out.println(set.size());
		set.clear();
		System.out.println(set);

	}

}
