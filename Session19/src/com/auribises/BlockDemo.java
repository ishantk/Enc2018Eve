package com.auribises;

class Block{
	
	Block(){
		System.out.println("This is Block Constructor");
	}
	
	// Initialization Block or Initializer
	{
		System.out.println("This is Block1");
	}
	
	{
		System.out.println("This is Block2");
	}
	
	static{
		System.out.println("This is a static Block1");
	}
	
}

public class BlockDemo {
	
	static{
		System.out.println("This is a static BlockDemo");
	}

	public static void main(String[] args) {
		System.out.println("-Main Started-");
		
		for(String str : args){
			System.out.println(str);
		}
		
		/*Block b1 = new Block();
		
		System.out.println("=============");
		
		Block b2 = new Block();*/
		
		System.out.println("-Main Finished-");
	}

}
