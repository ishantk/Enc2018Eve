package com.auribises;

class MyThread extends Thread{
	
	public void run(){
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("==MyThread=="+i);
		}
	}
	
}

public class ThreadsAgain {

	public static void main(String[] args) {
		
		System.out.println("Main Started..");

		MyThread mRef = new MyThread();
		
		mRef.setName("John");
		Thread.currentThread().setName("Jennie");
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10 | NORM_PRIORITY 5
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		
		mRef.start();
		/*try {
			mRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		mRef.yield();
		
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("**MainThread**"+i);
		}
		
		
		System.out.println("MyThread Name is "+mRef.getName());
		System.out.println("MainThread Name is "+Thread.currentThread().getName());
		
		System.out.println("MyThread Priority is "+mRef.getPriority());
		System.out.println("MainThread Priority is "+Thread.currentThread().getPriority());
		
		System.out.println("Main Finished..");
		
	}

}
