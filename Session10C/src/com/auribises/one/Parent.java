package com.auribises.one;

public class Parent {

	private void pvtShow(){
		System.out.println("This is private show in parent");
	}
	
	void defShow(){
		System.out.println("This is default show in parent");
	}
	
	protected void protShow(){
		System.out.println("This is protected show in parent");
	}
	
	public void pubShow(){
		System.out.println("This is public show in parent");
	}
	
}
