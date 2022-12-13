package model;

public class LoginHandler {
	private static String username = "Grit";
	private static String username2= "Grit2";
	private static String password= "hello";
	private static String password2="hello2";
		
	
	public static boolean getInfo(String user, String pass) {
		
		if(user.equals(username) && pass.equals(password)||(user.equals(username2) && pass.equals(password2))) {
			return true;
		}else {
			return false;
		}
		
	}

}
