// User : name, phone, email, password, gender, age, address

class User{
	String name;
	String phone;
	String email;
	String password;
	char gender;
	int age;
	
	Address adrs;   // HAS-A Relation | 1 to 1
	Vehicle[] vArr; // HAS-A Relation | 1 to many
	
	void showUserDetails(){
		System.out.println(name+" is "+age+" years old and can be contacted at "+phone);
		System.out.println("-----------------------------------------------------------");
		adrs.showAddressDetails();
		System.out.println("-----------------------------------------------------------");
		for(Vehicle v : vArr){
			v.showVehicleDetails();
		}
	}
}

class Address{
	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	void showAddressDetails(){
		System.out.println(adrsLine+" in "+city+" is from "+state+" having zipCode "+zipCode);
	}
}

class Vehicle{
	String name;
	String make;
	int type;
	String color;
	
	void showVehicleDetails(){
		System.out.println(name+" from "+make+" is "+type+" wheeler with "+color+" color");
	}
}

public class ComplexObjects {

	public static void main(String[] args) {
		
		User u1 = new User();
		Address a1 = new Address();
		
		u1.name = "John";
		u1.phone = "+91 98765434567";
		u1.email = "john@example.com";
		u1.password = "pass";
		u1.gender = 'M';
		u1.age = 20;
		
		a1.adrsLine = "Country Homes";
		a1.city = "Ludhiana";
		a1.state = "Punjab";
		a1.zipCode = 141001;
		
		u1.adrs = a1;
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		
		v1.name = "Honda City";
		v1.make = "Honda";
		v1.color = "Black";
		v1.type = 4;
		
		v2.name = "Swift";
		v2.make = "Maruti";
		v2.color = "White";
		v2.type = 4;
		
		v3.name = "Standard";
		v3.make = "Royal Enfield";
		v3.color = "Black";
		v3.type = 2;
		
		Vehicle[] arr = new Vehicle[3];
		arr[0] = v1;
		arr[1] = v2;
		arr[2] = v3;
		
		u1.vArr = arr; // Reference Copy
		
		u1.showUserDetails();
		
	}

}
