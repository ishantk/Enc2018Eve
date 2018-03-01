package com.auribises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileIO {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve","FileDemo.java");
			
			// Read the File in the form of bytes
			/*FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			int count = 0;
			while( (ch = fis.read()) != -1 ){
				
				char chr = (char)ch;
				
				if(chr=='a')
					count++;
				
				System.out.print(chr);
			}
			System.out.println();
			System.out.println("a occurs "+count+" times");
			
			fis.close();*/
			
			// Read the File in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			int cCount = 0;
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
				if(line.contains("class"))
					cCount++;
			}
			
			System.out.println(cCount+" classes found");
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		
		//String line = "public class FileIO {";
		//String className = line.substring(beginIndex, endIndex);
		//System.out.println("class Name is: "+className);

	}

}
