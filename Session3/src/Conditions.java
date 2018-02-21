
public class Conditions {

	public static void main(String[] args) {
		
		boolean isInternetConnected = true;
		boolean isGPSConnected = true;
		
		// if/else
		if(isInternetConnected){
			System.out.println("Browse the Internet");
		}else{
			System.out.println("Please Enable the Internet");
		}
		
		// nested if/else
		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("Browse the Internet and Navigate");
			}else{
				System.out.println("Please Enable GPS");
			}
		}else{
			System.out.println("Please Enable the Internet");
		}
		
		int a = 10;
		int b = 10;
		int c = 10;
		
		if(a>b){
			if(a>c){
				System.out.println("a is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}else{
			if(b>c){
				System.out.println("b is greatest");
			}else{
				System.out.println("c is greatest");				
			}
		}
		
		int ph = 80;
		int cm = 73;
		int mt = 52;
		
		int avg = (ph+cm+mt)/3;
		char ch = 'N';
		
		// Ladder if/else
		if(avg >= 80){
			ch = 'A';
		}else if(avg >=70 && avg < 80){
			ch = 'B';
		}else if(avg >=60 && avg < 70){
			ch = 'C';
		}else if(avg >=50 && avg < 60){
			ch = 'D';
		}else if(avg >=40 && avg < 50){
			ch = 'E';
		}else{
			ch = 'F';
		}

		System.out.println("Since you scored "+avg+" marks you got "+ch+" Grade");
		
		// switch/case
		int cabType = 1;
		final int olaMicro = 2;
		
		switch(cabType){
			case 1:
				System.out.println("Book OLA Mini");
				break;
				
			case olaMicro:
				System.out.println("Book OLA Micro");
				break;
				
			case 3:
				System.out.println("Book OLA Bike");
				break;
				
			case 4:
				System.out.println("Book OLA Auto");
				break;
				
			case 5:
				System.out.println("Book OLA Share");
				break;
				
			default:
				System.out.println("Not a Valid Choice");
				break;
		}
		
	}

}
