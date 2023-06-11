package Model;

public class loginValidation {
	public boolean loginValidation(String user,String pass) {
		if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("123")){
			return true;
		}else {
			return false;
		}
	}

}
