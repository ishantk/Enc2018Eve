package com.auribises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("John");
		set.add("Jack");
		set.add("Joe");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Joe");
		
		System.out.println(set);
		
	}

}
