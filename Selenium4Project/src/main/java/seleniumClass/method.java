package seleniumClass;

public class method {
	public static void xyz()
	{
		int x=1;
		int y=14;
		int z=x+y;
		System.out.println(z);
	}
	public static void meth1(int x, int y, int z) {//method overloading
		int k=x*y+z;
		System.out.println(k);
	}

	public static void main(String[] args) {
		xyz();
		meth1(5,6,7);
		meth1(21,5,0);
//		System.out.println(meth1.k);
	}

}
