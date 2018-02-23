package com.auribises;

/*class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed..");
	}
	
	void draw(){
		System.out.println("Drawing a Shape...");
	}
}*/

/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed..");
	}
	
	abstract void draw();
	
	void fun(){
		System.out.println("This is fun..");
	}
}*/

interface Shape{
	
	// interfaces cannot have objects. neither you nor RTE can create objects.
	/*Shape(){
		System.out.println("Shape Object Constructed..");
	}*/
	
	void draw(); // public abstract void draw();
	
}


class Circle implements Shape{//extends Shape{
	
	Circle(){
		System.out.println("Circle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle...");
	}
}

class Rectangle implements Shape{//extends Shape{
	
	Rectangle(){
		System.out.println("Rectangle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle...");
	}
}

class Triangle implements Shape{// extends Shape{
	
	Triangle(){
		System.out.println("Triangle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle...");
	}
}

public class RTPAgain {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Circle();
		s.draw();
		
		System.out.println("====================");
		
		s = new Rectangle();
		s.draw();
		
		System.out.println("====================");
		
		s = new Triangle();
		s.draw();
		
		System.out.println("====================");
		
		/*s = new Shape();
		s.draw();*/
	}

}
