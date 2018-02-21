
public class DataTypes {

	public static void main(String[] args) {
		
		// Write Data in a Single Value Container
		byte b = 10;
		short s = 10;
		
		b = (byte)257; // DownCast
		
		// Write Data from a Single Value Container
		System.out.println("b is: "+b);
		System.out.println("c is: "+s);
		
		int i = 10;
		
		long l = 10;
		l = 10000000000L;
		
		long lNum = 100;
		byte bNum = (byte)lNum; // DownCasting
		
		float f1 = (float)2.2;
		float f2 = 2.2f;
		double d = 2.2;
		
		char ch = 'A';
		ch = 67; // ASCII Code
		ch = '\u0905';
		ch = '\u20b9';
		System.out.println("ch is: "+ch);

		boolean isInternetConnected = true;
		boolean isGPSConnected = false;
		
		String str = "Hello World"; // Multi Value Container | Reference Type
		System.out.println("str is: "+str);
	}

}
