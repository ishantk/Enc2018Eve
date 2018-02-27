package com.auribises;

public class StringDemo {

	public static void main(String[] args) {
	
		// Interned Strings
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Non Interned Strings
		String str3 = new String("Hello");
		String str4 = new String("HEllo");
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");			
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");			
		}
		
		if(str1 == str4){
			System.out.println("str1 == str4");
		}else{
			System.out.println("str1 != str4");			
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 is equal to str4");
		}
		
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 is equal to str4");
		}
		
		System.out.println("str1 is: "+str1);
		System.out.println("str3 is: "+str3);
		
		// Strings are IMMUTABLE
		String str5 = "This is Awesome !!";
		String str6 = str5.toUpperCase();
		
		System.out.println("str5 is "+str5);
		System.out.println("str6 is "+str6);
		
		String names = "John, Jennie, Jim, Jack, John, Joe";
		int l = names.length();
		System.out.println("Length is: "+l);
		
		char[] chArr = names.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" ");
		}
		
		System.out.println();
		String[] strArr = names.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		if(names.contains("Joe")){
			System.out.println("Joe is in");
		}else{
			System.out.println("Joe not found");
		}

		char ch = names.charAt(names.length()-1);
		System.out.println("ch is: "+ch);
		
		//String names = "John, Jennie, Jim, Jack, Joe";
		//String str7 = names.substring(0,5);
		//String str7 = names.substring(7,12);
		String str7 = names.substring(12);
		System.out.println("str7 is: "+str7);
		
		//int idx = names.indexOf('J');
		//int idx = names.lastIndexOf('J');
		//int idx = names.indexOf("John");
		int idx = names.lastIndexOf("John");
		System.out.println("idx is: "+idx);
		
		// IMMUTABLE String
		String str = new String("This is Awesome");
		
		// MUTABLE Strings
		StringBuffer buffer = new StringBuffer("This is Awesome"); 		// Thread-Safe
		StringBuilder builder = new StringBuilder("This is Awesome");   // Not Thread-Safe
		
		str.concat(" !! Thank You !!");
		buffer.append(" !! Thank You !!");
		builder.append(" !! Thank You !!");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		
		CharSequence cs = null;
		cs = new String();
		cs = new StringBuffer();
		cs = new StringBuilder();
	}

}
