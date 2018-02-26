class Employee{
	
	void sayHello(String name){
		System.out.println("Hello, "+name);
	}
	
}


public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started..");
		
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[10] is: "+arr[10]);
		}catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Some Error Occurred !!");
			//System.out.println("Some Error Occurred !! "+aRef);
			//aRef.printStackTrace();
		}
		
		int a=10,b=2,c=0;
		Employee eRef = null;
		
		try{
			c = a/b;	
			eRef.sayHello("John Watson");
			/*try{
				
			}catch(NullPointerException npe){
				System.out.println("Some NullPointerException: "+npe);
			}*/
			
		}/*catch(ArithmeticException ae){
			System.out.println("Some Error : "+ae);
		}catch(NullPointerException ae){
			System.out.println("Some Error : "+ae);
		}*/catch(Exception e){
			System.out.println("Some Exception: "+e);
		}finally{
			System.out.println("This is finally");
		}
		
		System.out.println("c is: "+c);
		
		System.out.println("This is important statement");
		
		
		
		
		
		System.out.println("Main Finished..");
		
		

	}

}
