package com.auribises;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

class A{

	private class B{
		
	}
	
	class C{
		
	}
	
	protected class D{
		
	}
	
	public class E{
		
	}
	
	static class F{
		
	}
	
	interface Inf{
		
	}
	
	static interface Inf1{
		
	}
	
	void show(){
		class X{ // Local Class
			
		}
		
		X x = new X();
		
		//interface Inf2{ // No Local Interfaces. Its an Error
			
		//}
	}
	
	static void hello(){
		//static class Y{ error
			
		//}
		
		class Y{ // OK
			
		}
	}
	
}

public class NestingDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

		System.out.println(oRef);
		System.out.println(iRef);
		
	}

}
