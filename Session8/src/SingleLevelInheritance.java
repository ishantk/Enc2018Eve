class Login{
	
	void loginUser(String uname, String password){
		System.out.println(uname+ " user has a password: "+password);
	}
	
}

class FaceBookLogin extends Login{
	
	// Over-Riding
	void loginUser(String uname, String password){
		System.out.println(uname+ " user has a password: "+password+" in facebook");
	}
	
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		FaceBookLogin fbLogin = new FaceBookLogin();
		fbLogin.loginUser("john@example.com", "password");
	}

}
