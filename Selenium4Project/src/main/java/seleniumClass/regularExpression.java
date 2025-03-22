
package seleniumClass;

import java.util.regex.Pattern;

public class regularExpression {
	public static void main(String[] args) {
		String x="afreen abdul arhaan anaya Hi How are you";
//		char a;
//		int c=0;
//		for(int i=0;i<x.length();i++)
//		{
//			a=x.charAt(i);
//			if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
//			{
//				c++;
//			}
//		}
//		System.out.println(c);
		char q[]=x.toCharArray();
		int vowel=0;
		int cons=0;
		for(char xyz:q) {
			if(Pattern.matches("[aeiou]", Character.toString(xyz))) {
				vowel++;
			}
			else {
				cons++;
			}}
		
			System.out.println("vowels are"+vowel);
			System.out.println("Consonats are"+cons);
		
			
	}

}
