class Area{
	
	void calArea(int l, int b){
		int a = l*b;
		System.out.println("Area of rectangle is : "+a);
	}
	
	void calArea(float r){
		float a = 3.14f * r * r;
		System.out.println("Area of circle is : "+a);
	}
	
	void calArea(int side){
		int a = side * side;
		System.out.println("Area of square is : "+a);
	}
	
	/*
	 * Method Overloading
	 * 1. Method Name should be Same
	 * 2. Inputs Should be Unique i.e. always different
	 * 	2.1 Number of Inputs
	 *  2.2 Type of Inputs
	 *  2.3 Sequence of Inputs
	 * 3. Return Type has no Role
	 */
	
	void fun(){
		
	}
	
	void fun(int i){
		
	}
	
	void fun(int i, int j){
		
	}
	
	
	void fun(float j){
		
	}
	
	void fun(long l){
		
	}
	
	void fun(int i, float j){
		
	}
	
	void fun(float i, int j){
		
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		Area aRef = new Area();
		aRef.calArea(10, 20);
		aRef.calArea(10.5f);
		aRef.calArea(15);

	}

}
