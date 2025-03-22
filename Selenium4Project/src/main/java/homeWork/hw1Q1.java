package homeWork;

public class hw1Q1 {

	
	public static void bike(int x) {
		// TODO Auto-generated method stub
		if(x==120 || x==170 || x==180 || x==185 || x==400)
		{
			System.out.println("Your bike need repair");
		}
		else {
			System.out.println("Your bike is in good condition");
		}
	
	}	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			bike(120);
			bike(170);
			bike(180);
			bike(185);
			bike(400);
			bike(401);
		}

}
