package com.auribises;

class MyStack{
	
	int[] arr;
	int idx;
	
	MyStack(){
		arr = new int[100];
		idx = 0;
	}
	
	void pushElement(int element){
		arr[idx] = element;
		idx++;
	}
	
	void popElement(){
		arr[idx] = 0;
		idx--;
	}
}

class PushThread extends Thread{
	
	// loop somewhere in thread for 10 times
	
}

class PopThread extends Thread{
	
	// loop somewhere in thread for 10 times
}

public class Test {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		//...
		//...
		
		
	}

}
