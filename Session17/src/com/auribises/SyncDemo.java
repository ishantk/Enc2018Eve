package com.auribises;

class Table{
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		System.out.println("This is fun");
	}
}

class ThreadOne extends Thread{
	
	Table t;
	
	ThreadOne(Table s){
		t = s;
	}
	
	public void run(){
		synchronized(t){ // synnchronized block
			t.printTable(5);
			t.fun();
		}
	}
}

class ThreadTwo extends Thread{
	
	Table t;
	
	ThreadTwo(Table s){
		t = s;
	}
	
	public void run(){
		synchronized(t){ // synnchronized block
			t.printTable(7);
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		Table tRef = new Table();
		
		Thread tOne = new ThreadOne(tRef);
		ThreadTwo tTwo = new ThreadTwo(tRef);
		
		tOne.start();
		tTwo.start();

	}

}
