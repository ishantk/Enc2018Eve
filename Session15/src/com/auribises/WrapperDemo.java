package com.auribises;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Primitive Type
		int i = 10;
		
		// You can convert primitive type into a reference type i.e. object
		// with wrapper class
		/*
		 * int -> Integer
		 * float -> Float
		 * double -> Double
		 * long -> Long
		 * char -> Character
		 */

		// BOXING
		Integer iRef = new Integer(i);
		// UNBOXING
		int j = iRef.intValue();
		
		
		char ch = 'A';
		// BOXING
		Character cRef = new Character(ch);
		// UNBOXING
		char ch1 = cRef.charValue();
		
		float f = 10.2f;
		
		Float fRef = new Float(f);
		float g = fRef.floatValue();
		
		
		long l = 100;
		Long lRef = l; // AUTOBOXING   | Long lRef = new Long(l);
		long m = lRef;    // AUTOUNBOXING | long m = lRef.longValue();
	}

}
