package com.auribises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("App Started..");
		
		/*Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.address = "Redwood Shores";*/
		
		//Student s1 = new Student(101,"John","Redwood Shores");
		
		//System.out.println(s1);
		//System.out.println(s1.toString());*/
		
		// Serialization
		// To Save the state(data) of an object in a file
		
		/*try {
			
			File file = new File("/Users/ishantkumar/Downloads/yourstudents.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			
			System.out.println("Data Written in File");
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// De-Serialization
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/yourstudents.dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student sRef = (Student)ois.readObject();
			
			System.out.println("Data Read and Object Data :");
			System.out.println(sRef);
			
			ois.close();
			fis.close();
			
			//System.out.println("Data Written in File");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("App Finished..");

	}

}
