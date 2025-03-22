package seleniumClass;

import java.util.Scanner;

public class scannerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var=new Scanner(System.in);//ctrl+shift+o
		System.out.println("please enter the name :");
		String name=var.next();
		Scanner var1=new Scanner(System.in);//ctrl+shift+o
		System.out.println("please enter your age:");
		
		int age=var1.nextInt();
		System.out.println("Hi "+name +" & your age is "+age);
	}

}

