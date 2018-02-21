class Mathematics{
	
	
	// Non Static Methods - Property of Object
	void add1(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	void add2(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	int add3(int a, int b){
		int c = a+b;
		return c;
	}
	
	
	// Static Methods - Property of Class
	static void sAdd1(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	static void sAdd2(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	static int sAdd3(int a, int b){ // Value Copy
		int c = a+b;
		return c;
	}
	
	void printNums(int[] arr){ // Reference Copy
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
}


public class MethodsDemo {

	public static void main(String[] args) {
		
		// Execute the Methods - Non Static
		Mathematics mRef = new Mathematics();
		mRef.add1();
		mRef.add2(100, 200);
		int result = mRef.add3(1000, 2000);
		System.out.println("Result is: "+result);
		
		
		int[] a1 = {10,20,30,40,50};
		int[] a2 = {100,200,300,400,500};
		mRef.printNums(a1);
		mRef.printNums(a2);
		
		System.out.println("=======================");
		
		// Execute the Methods - Static
		Mathematics.sAdd1();
		Mathematics.sAdd2(12, 13);
		Mathematics.sAdd2(20, 16);
		Mathematics.sAdd2(25, 67);
		int res = Mathematics.sAdd3(23,12);
		System.out.println("Result is: "+res);
		

	}

}
