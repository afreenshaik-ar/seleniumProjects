package seleniumClass;

import java.util.regex.Pattern;

public class regExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q="UzZhjfG76";
		//System.out.println( Pattern.matches("[A-Za-z0-9]{5,}", q));
		String p="Welcome@1";
		String pwdfrmt="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()-]).{8,30}$";
		if(Pattern.matches(pwdfrmt, p)) {
			System.out.println("Password successfull");
		}
		else{
			System.out.println("Reenter password with  mentioned criteria");
			
		}
	}

}
