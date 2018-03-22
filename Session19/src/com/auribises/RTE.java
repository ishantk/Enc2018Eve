package com.auribises;

class Student{
	
	int roll;
	String name;
	int age;
	
	Student(){
		System.out.println("Student Object Constructed");
	}
	
	void showStudent(){
		System.out.println("Student Details: "+roll+" - "+name+" - "+age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student Object Destructed");
	}
}

class ShutDownThread extends Thread{
	
	public void run() {
		System.out.println("ShutDown Thread in Execution");
	}
}

public class RTE {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		//s1 = null;
		//s2 = null;
		
		//System.gc();
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Total Memory: "+rt.totalMemory());
		
		s1 = null;
		s2 = null;
		
		rt.gc();
		
		ShutDownThread sRef = new ShutDownThread();
		rt.addShutdownHook(sRef);
		
		System.out.println("==GC Executed==");
		
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Total Memory: "+rt.totalMemory());

	}

}
