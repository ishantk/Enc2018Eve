package com.auribises;

class Login{
	
	Login(){
		System.out.println("Login Object Constructed..");
	}
	
	void login(){
		System.out.println("Login User..");
	}
}

class FacebookLogin extends Login{
	
	FacebookLogin(){
		System.out.println("FacebookLogin Object Constructed..");
	}
	
	void login(){
		System.out.println("Login User with FaceBook..");
	}
}

class GoogleLogin extends Login{
	
	GoogleLogin(){
		System.out.println("GoogleLogin Object Constructed..");
	}
	
	void login(){
		System.out.println("Login User with GoogleLogin..");
	}
}

// Run Time Polymorphism
public class RTP {

	public static void main(String[] args) {

		//FacebookLogin fbLogin = new FacebookLogin();
		//fbLogin.login();
		
		//GoogleLogin gLogin = new GoogleLogin();
		//gLogin.login();
		
		Login lRef;
		
		lRef = new FacebookLogin();
		lRef.login();
		
		System.out.println("===============");
		
		lRef = new GoogleLogin();
		lRef.login();
		
	}

}
