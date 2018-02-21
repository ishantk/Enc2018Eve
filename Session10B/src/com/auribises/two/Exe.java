package com.auribises.two;

//import com.auribises.one.One; // error
import com.auribises.one.Two;

public class Exe {

	public static void main(String[] args) {
		
		Two t = new Two();
		//t.pvtShow(); //error
		//t.defShow(); //error
		//t.protShow(); //error
		t.pubShow();

	}

}
