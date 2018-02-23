class Employee{
	
	int id;
	String name;
	int salary;
	
	static String companyName;
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.id= 101;
		e1.name = "John";
		e1.salary = 30000;
		
		e2.id= 103;
		e2.name = "Jennie";
		e2.salary = 37000;
		
		
		e3.id= 110;
		e3.name = "Fionna";
		e3.salary = 50000;
		
		Employee.companyName = "Auribises";
		
		System.out.println(e1.name+" withdraws "+e1.salary+" from "+e1.companyName);
		System.out.println(e2.name+" withdraws "+e3.salary+" from "+e2.companyName);
		System.out.println(e3.name+" withdraws "+e3.salary+" from "+e3.companyName);
		
		
	}

}
