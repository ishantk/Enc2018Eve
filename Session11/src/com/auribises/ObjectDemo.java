package com.auribises;

class Student{ //extends Object{
	
	int roll;
	String name;
	
	public String toString(){
		String str = "This is Awesome !!";
		return str;
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		System.out.println("s1 is: "+s1);
		System.out.println("s1 toString is: "+s1.toString());
		System.out.println("s1 hashCode is: "+s1.hashCode());
		System.out.println("s1 getClass is: "+s1.getClass());
		
		Object o = new Student(); // Polymorphic Statement

	}

}
