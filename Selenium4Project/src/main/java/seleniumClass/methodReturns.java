package seleniumClass;

public class methodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1=add(100,20);

	}
	public static int add(int x, int y) {
		int c=x+y;
		System.out.println("addition of "+x+ " and "+y+" is "+c);
		return c;
	}
	public static int add(int x, int y,int z) {
		int c=x+y-z;
		System.out.println("addition of "+x+ " and "+y+" minus "+z+" is "+c);
		return c;
	}

}
