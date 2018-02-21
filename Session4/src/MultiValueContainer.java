
public class MultiValueContainer {

	public static void main(String[] args) {
		
		int i = 10;
		// i is a single value container
		// int is a data type
		// 10 is a literal i.e. value or data
		
		//int j = 10,20,30,40,50; // error

		/*int olaMicro = 100;
		int olaMini = 200;
		int olaShare = 50;
		int olaAuto = 30;
		int olaBike = 25;*/
		
		// Multi Value Container
		// Array | Collection of data of same type
		int[] ola = {100,200,50,30,25};
		// ola is a reference variable
		
		System.out.println("i is: "+i);
		System.out.println("ola is: "+ola);
		
		int k = i; 		// Value Copy
		int[] l = ola;  // Reference Copy
		
		System.out.println("k is: "+k);
		System.out.println("l is: "+l);
		
		// Read from Array
		/*System.out.println(ola[0]);
		System.out.println(ola[1]);
		System.out.println(l[2]);
		System.out.println(ola[3]);
		System.out.println(ola[4]);*/
		
		for(int idx=0;idx<5;idx++){
			System.out.println(ola[idx]);
		}
		
		System.out.println("===============");
		
		// Write in Array
		ola[0] = 300;
		ola[4] = 125;
		
		for(int idx=0;idx<l.length;idx++){
			System.out.println(l[idx]);
		}
		
		int len = l.length;
		System.out.println("Length of ola is: "+len);
		
		System.out.println("======Enhanced For Loop======");
		
		for(int price : ola){
			System.out.println(price);
		}
		
	}

}
