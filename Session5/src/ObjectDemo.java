class User{
	
	// Attributes of an Object
	String name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
	
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		int i = 10;  // i is a Variable
		
		
		int[] arr = {10,20,30,40,50}; // arr is a Reference Variable
		
		// Object Construction Statement
		User u1 = new User(); // u1 is a Reference Variable
		User u2 = new User(); // u1 is a Reference Variable
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		int j = i;    // Value Copy
		User u3 = u1; // Reference Copy
		
		System.out.println("j is: "+j);
		System.out.println("u3 is: "+u3);
		
		// Write the data in Object
		u1.name = "John";
		u3.email = "john@example.com";
		u1.gender = 'M';
		u1.age = 28;
		u1.address = "Redwood Shores";
		
		u2.name = "Jennie";
		u2.email = "jennie@example.com";
		u2.gender = 'F';
		u2.age = 29;
		u2.address = "Country Homes North";
		
		// Read The data from Object
		System.out.println(u1.name+" is "+u1.age+" years old and lives in "+u3.address);
		System.out.println(u2.name+" is "+u2.age+" years old and lives in "+u2.address);
		
	
		
	}

}
