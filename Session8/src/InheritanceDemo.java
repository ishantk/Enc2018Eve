class Parent{
	
	String fname;
	String lname;
	int money;
	
	// Constructors are Never Inherited
	Parent(){
		fname = "John";
		lname = "Watson";
		money = 100000;
		System.out.println("Parent Object Constructed");
	}
	
	void showParentDetails(){
		System.out.println(fname+" "+lname+" has \u20b9"+money);
	}
}

class Child extends Parent{ // IS-A
	Child(){
		System.out.println("Child Object Constructed");
	}
	
	void showChildDetails(){
		System.out.println("This is Child "+fname+" - "+lname+" - "+money);
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.showParentDetails();
		
		Child cRef = new Child();
		
		cRef.fname = "Jennie";
		
		//cRef.showChildDetails();
		
		cRef.showParentDetails();
	}

}
