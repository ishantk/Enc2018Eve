package com.auribises;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**My Task** "+i);
		}
	}
}*/

class MyTask extends Thread{ 
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("**My Task** "+i);
		}
	}
	
}

class YourTask extends Thread{ 
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("##Your Task## "+i);
		}
	}
	
}

class A{
	
}

class OurTask extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("@@Our Task@@ "+i);
		}
	}
}


public class ThreadsDemo {

	public static void main(String[] args) {
		
		System.out.println("==Main Started=="); // 1
		
		MyTask mtRef = new MyTask();	// 2
		YourTask ytRef = new YourTask();
		Runnable r = new OurTask(); // Polymorphic Statement
		Thread th = new Thread(r);
		
		//mtRef.executeTask();  		// 3
		mtRef.start(); // start method will internally execute the run method
		ytRef.start();
		th.start();
		
		for(int i=1;i<=10;i++){		// 4
			System.out.println("==Main Thread== "+i);
		}
		
		System.out.println("==Main Finished=="); // 5

	}

}
