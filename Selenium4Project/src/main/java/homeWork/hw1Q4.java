package homeWork;

public class hw1Q4 {
	public static void printnumber(int num) {
		for(int i=1;i<=1000;i++)
		{
			System.out.println(i);
			if(i==num)
			{
				break;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnumber(50);

	}

}
