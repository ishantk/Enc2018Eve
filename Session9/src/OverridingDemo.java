class Parent{
	
	void purchaseBike(){
		System.out.println("Lets Buy Pulsar..");
	}
	
	static void purchaseCar(){
		System.out.println("Lets Buy Maruti..");
	}
}

class Child extends Parent{
	
	// Method Overriding
	void purchaseBike(){
		System.out.println("Lets Buy Royal Enfield..");
	}
	
	// Method Hiding
	static void purchaseCar(){
		System.out.println("Lets Buy Honda..");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Child cRef = new Child();
		cRef.purchaseBike();
		Child.purchaseCar();

	}

}
