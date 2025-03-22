package homeWork;

import java.util.Scanner;

public class hw2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grade of a student");
		Scanner sc= new Scanner(System.in);
		
		int n=1;
//		int n;
		while( n>0){
			System.out.println("Please enter number between 1 to 100:");
			n=sc.nextInt();
			if(n<=-1 || n>100) {
				System.out.println("Entered out of range, Exiting");
				break;
			}
			else if(n >90 && n<=100) {
				System.out.println("number is morethan 90 Grade A");
				break;
			}
			else if(n <=90 && n>=80) {
				System.out.println("number is between 80 and 90 Grade B");
				break;
			}
			else if(n <=79 && n>=70) {
				System.out.println("number is between 70 and 79 Grade C");
				break;
			}
			else if(n <=69 && n>=60) {
				System.out.println("number is between 60 and 69 Grade D");
				break;
			}
			else if(n <=59 && n>=50) {
				System.out.println("number is between 50 and 59 Grade E");
				break;
			}
			else if(n <=50 && n>=0){
				System.out.println("number is below: Grade F");
				break;
			}
			else {
				System.out.println("entered invalid");
				break;
			}
		}

	}

}
