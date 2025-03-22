package seleniumClass;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Abdul. Shaik");
		alist.add("Afreen. Shaik");
		alist.add("Arhaan. Shaik");
		alist.add("Ayaat. Shaik");
		alist.add("Shaik");
		alist.add("afterremovedShaik");
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		System.out.println(alist.get(5));
		System.out.println(alist.size());
		System.out.println(alist.remove(4));
		System.out.println(alist.get(4));

	}

}
