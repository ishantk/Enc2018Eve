class CA{
	
	int a;
	int b;
	
	// Constructor - Default Constructor
	CA(){
		a = 1;
		b = 1;
	}
	
	// Constructor - Parmeterized or Argument Constructor
	CA(int p, int q){
		a = p;
		b = q;
	}
	
	void showDetails(){
		System.out.println("a is: "+a+" and b is: "+b);
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		CA ca1 = new CA();
		CA ca2 = new CA(10,20);
		
		/*ca1.a = 10;
		ca1.b = 20;
		
		ca2.a = 30;
		ca2.b = 40;*/
		
		ca1.showDetails();
		ca2.showDetails();

	}

}
