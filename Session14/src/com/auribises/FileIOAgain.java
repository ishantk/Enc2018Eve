package com.auribises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileIOAgain {

	public static void main(String[] args) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve","happyholiagain.txt");
			
			//FileOutputStream fos = new FileOutputStream(file);
			/*FileOutputStream fos = new FileOutputStream(file,true); // append mode
			
			String quote = "Holi is all aboud being together and celebrations !!";
			
			fos.write(quote.getBytes());
			
			fos.close();*/
			
			FileWriter writer = new FileWriter(file);
			String quote = "Enjoy Holi !! Spread Colors of Happiness !!";
			writer.write(quote);

			writer.close();
			
			System.out.println("File Contents Written !!");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}
