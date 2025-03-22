package seleniumClass;

public class selectCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='D';
		switch(grade)
		{
		case 'A':
			System.out.println("90-100");
		case 'B':
			System.out.println("80-189");
		case 'C':
			System.out.println("70-79");
			break;
		case 'D':
			System.out.println("60-69");
		case 'E':
			System.out.println("50-59");
		case 'F':
			System.out.println("Fail");
		default:
			System.out.println("Out of range");
		}

	}

}
