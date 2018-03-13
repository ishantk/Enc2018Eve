package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	
	Employee(){
		
	}
	
	Employee(int id, String nm){
		eid = id;
		name = nm;
	}
	
	@Override
	public String toString() {
		return "Employee Details: "+eid+" - "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		// Not Thread Safe
		ArrayList list1 = new ArrayList(); // Hetrogeneous
		ArrayList<String> list2 = new ArrayList<String>(); // Homogeneous
		
		//List list3 = new ArrayList(); // Polymorphic Statement
		
		ArrayList<Employee> list4 = new ArrayList<Employee>(); // Homogeneous
		
		//1. Add the data in list
		
		Employee e1 = new Employee(101,"George");
		
		list1.add(100);    // 0
		list1.add("John");
		list1.add(2.2f);
		list1.add('A');
		list1.add(e1);     // n-1
		
		// View data in list
		System.out.println(list1);
		
		// size of list
		int size = list1.size();
		System.out.println("list1 size is: "+size);
		
		// read single element
		System.out.println(list1.get(0));
		
		// remove element
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.get(1));
		
		// update the element in list
		list1.set(1, "John Watson");
		System.out.println(list1);
		
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("John");
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(100); error
		
		
		list4.add(e1);
		//list4.add("Hello"); error
		
		System.out.println(list2);
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.lastIndexOf("John");//list2.indexOf("John");
		System.out.println("index of John is "+idx);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Fionna");
		names.add("Kim");
		names.add("George");
		
		list2.addAll(names);
		
		System.out.println(list2);
		System.out.println(names);
		
		// Read All Elements in List
		System.out.println("=======For Loop=======");
		// 1. For Loop
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		System.out.println("======================");
		
		System.out.println("=======Enhanced For Loop=======");
		// 2. Enhanced For Loop
		for(String str : list2){
			System.out.println(str);
		}
		System.out.println("======================");
		for(Object o : list1){
			System.out.println(o);
		}
		
		System.out.println("=========3. Iterator=============");
		
		// 3. Iterator Loop
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
			
			if(str.equals("Jennie"))
				itr.remove(); // remove Jennie from list
			
		}
		
		System.out.println("======================");
		
		System.out.println("=========4. ListIterator=============");
		
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String str = listItr.next();
			System.out.println(str);
		}
		
		System.out.println("======================");
		
		while(listItr.hasPrevious()){
			String str = listItr.previous();
			System.out.println(str);
		}
		
		System.out.println("======================");
		
		System.out.println("=========5. Enumeration=============");
		
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		System.out.println("======================");
		
		// Thread-Safe
		Vector<String> vector = new Vector<String>();
		List list = new Vector();
		
		vector.add("Fionna");
		vector.add("Kim");
		vector.add("George");
		vector.add("Kim");
		
		System.out.println(vector);
		
		System.out.println("======================");
		
		for(String str : vector){
			System.out.println(str);
		}
		
	}

}
