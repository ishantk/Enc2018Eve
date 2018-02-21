package com.auribises.one;

class One{
	
	private void pvtShow(){
		System.out.println("this is private show of One");
	}
	
	void defShow(){
		System.out.println("this is default show of One");
	}
	
	protected void protShow(){
		System.out.println("this is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("this is public show of One");
	}
	
}

// error
/*private class Two{
	
}


protected class Three{
	
}*/


public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		//.pvtShow(); error
		o.defShow();
		o.protShow();
		o.pubShow();
		
		System.out.println("==================");
		
		Two t = new Two();
		//t.pvtShow(); //error
		t.defShow();
		t.protShow();
		t.pubShow();
			
	}

}
