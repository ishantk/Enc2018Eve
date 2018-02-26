import java.io.IOException;

// User Defined Exceptions
class BankingException extends RuntimeException{ // UNCHECKED
	
}

class BankingException1 extends Exception{ // CHECKED
	
}

class Banking{
	
	int balance = 10000;
	int minBal = 2000;
	
	int attempts = 0;
	
	void witdraw(int amt){
		
		balance = balance - amt;
		
		if(balance <= minBal){
			balance = balance + amt;
			System.out.println("Witdrawl Failure. Balance is LOW \u20b9"+balance);
			attempts++;
			
			if(attempts>3){
				// THROWING AN UNCHECKED EXCEPTION
				//NullPointerException npe = new NullPointerException();
				//throw npe;
				
				BankingException be = new BankingException();
				throw be;
			}
		}else{
			System.out.println("Witdrawl Success. New Balance \u20b9"+balance);
		}
		
	}
	
	void witdrawAgain(int amt) throws IOException {
		
		balance = balance - amt;
		
		if(balance <= minBal){
			balance = balance + amt;
			System.out.println("Witdrawl Failure. Balance is LOW \u20b9"+balance);
			attempts++;
			
			if(attempts>3){
				// THROWING A CHECKED EXCEPTION
				IOException io = new IOException();
				throw io;
			}
		}else{
			System.out.println("Witdrawl Success. New Balance \u20b9"+balance);
		}
		
	}
}


public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Banking Started..");
		
		Banking bRef = new Banking();
		
		for(int i=1;i<=7;i++){
			bRef.witdraw(3000);
			/*try{
			bRef.witdrawAgain(3000);
			}catch(IOException io){
				System.out.println("Exception: "+io);
			}*/
		}
	
		System.out.println("Banking Finished..");
	}

}
