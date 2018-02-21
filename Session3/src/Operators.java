
public class Operators {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 11;
		
		int num3 = num1 ^ num2;
		System.out.println("num3 is: "+num3);

		int x = 10;
//		x++;
//		++x;
//		++x;
//		++x;
		
		int y = x++;
		
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		
		
		int a = -8;
		int b = a >> 3; // divide by 2 pow 3
		int c = a << 3; // multiply by 2 pow 3
		
		System.out.println("b is: "+b);
		System.out.println("c is: "+c);
		
		int age = 2;
		
		int vote = (age>18) ? 1 : 0; // if/else
		System.out.println("vote is: "+vote);
		
	}

}
