package com.auribises;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		// File API
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve/myFile.txt");
			//File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve","myFile.txt");
			File file = new File("/Users/ishantkumar/Downloads");
			
			//File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve","myFile.txt");
			//File newfile = new File("/Users/ishantkumar/Downloads/Enc2018Eve","yourFile.txt");
			
			//File file = new File("/Users/ishantkumar/Downloads/Enc2018Eve","yourFile.txt");
			
			if(file.exists()){
				
				
				if(file.isDirectory()){
					System.out.println(file.getName()+" Exists and is a Directory");
					
					System.out.println("=====================");
					String[] names = file.list();
					for(String str : names){
						//if(str.endsWith(".png"))
							System.out.println(str);
					}
					System.out.println("=====================");
					
				}else{
					System.out.println(file.getName()+" Exists and is a File");
					
					//file.renameTo(newfile);
					//System.out.println(file.getName()+" renamed to "+newfile.getName());
					
					//file.delete();
					//System.out.println(file.getName()+" deleted ");
					
					//file.lastModified();
					
				}
				
				
			}else{
				System.out.println(file.getName()+" Does Not Exists");
			}
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}
