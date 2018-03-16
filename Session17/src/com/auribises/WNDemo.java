package com.auribises;

class Message{
	
	String msg = "No Message Available";
	
	void writeMessage(){
		msg = "Search the Candle rather than cursing the darkenss!!";
		System.out.println("Message Written..");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			m.writeMessage();
			//m.notify();
			m.notifyAll();
		}
	}
}


public class WNDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getState());
		
		Message mRef = new Message();
		
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		//Thread.State.NEW
	}

}
