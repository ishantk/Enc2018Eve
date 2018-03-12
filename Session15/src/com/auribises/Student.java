package com.auribises;

import java.io.Serializable;

public class Student implements Serializable{
	
	int roll;
	String name;
	transient String address;
	//String timeStamp;

	// Default Constructor
	public Student(){
		
	}

	// Parameterized Constructor
	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
