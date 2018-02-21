class A{
	
	int a;
	static int b;
	
	A(){
		System.out.println("A Object Constrcuted");
	}
	
	void showData(){
		System.out.println("a is: "+a);
	}
	
	static void showStaticData(){
		System.out.println("b is: "+b);
	}
}

class B extends A{
	
	int c;
	
	static int d;
	
	B(){
		System.out.println("B Object Constructed");
	}
	
	void showDetailsInB(){
		System.out.println("c is: "+c);
	}
	
	static void showStaticDetailsInB(){
		System.out.println("d is: "+d);
	}
}

class X{
	
}

class Y{
	
}

/*class Z extends X, Y{ // Multiple Extension Not Allowed
	
}*/


public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*A aRef1 = new A();
		A aRef2 = new A();*/
		
		B bRef = new B();
		
		
		// Write and Read in Object
		
		bRef.a = 100;
		bRef.c = 200;
		
		bRef.showData();
		bRef.showDetailsInB();
		
		System.out.println("===================");
		
		// Write and Read in Class
		B.b = 1000;
		B.d = 2000;
		
		B.showStaticData();
		B.showStaticDetailsInB();
		

	}

}
