class Student{
	
	// Attributes
	int roll;
	private String name;
	int age;
	char gender;
	private int std;
	String address;
	
	// Methods
	
	//1. Setter Method : Which will write the data in Object
	void setName(String nm){
		
		if(nm.length()>3){
			name = nm;
		}else{
			System.out.println("Please Enter a Valid Name");
		}
	}
	
	void setStd(int s){
		std = s;
	}
	
	//2. Getter Method : Which will read the data from Object
	
	String getName(){
		return name;
	}
	
	int getStd(){
		return std;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // Object Construction Statement
		// s1 is a reference variable
		
		//s1.name = "John";
		s1.setName("John");
		
		s1.gender = 'M';
		
		//s1.std = 10;
		s1.setStd(10);
		
		//System.out.println(s1.name +" studies in "+s1.std+" std" );
		System.out.println(s1.getName() +" studies in "+s1.getStd()+" std" );

	}

}
