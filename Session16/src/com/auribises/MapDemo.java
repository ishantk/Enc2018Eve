package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		// HashMap is not Thread Safe
		// HashMap can have null key and null values
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Add Data in HashMap
		map.put(101, "John");
		map.put(211, "Jennie");
		map.put(137, "Jim");
		map.put(516, "Jack");
		map.put(324, "Joe");
		map.put(211, "George"); // value will be updated
		map.put(null, "Fionna");
		
		map.remove(324);
		
		// get the data in map
		System.out.println("map is: "+map);
		
		// get the element from map
		String name = map.get(211);
		System.out.println("name is: "+name);
		
		// Check the data in map
		if(map.containsKey(211)){
			System.out.println("211 key exists");
		}
		
		if(map.containsValue("George")){
			System.out.println("George value exists");
		}
		
		// Iterating in the Map
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		System.out.println("==============");
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		// Hashtable is Thread Safe
		// Hashtable cannot have null key and null values
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(211, "Jennie");
		table.put(137, "Jim");
		table.put(516, "Jack");
		table.put(324, "Joe");
		table.put(211, "George"); // value will be updated
		//table.put(null,"Fionna"); // null key or null value not allowed
		
		System.out.println(table);
	}

}
