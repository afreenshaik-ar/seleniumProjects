package seleniumClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class randomNumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	for(int i=0;i<=10;i++) {
		Random r=new Random(System.currentTimeMillis());
		int k=r.nextInt(999);
		System.out.println(k);
		Thread.sleep(1000);
		}*/
		/*for (int i=1;i<=10;i++) {
			int w=(int)(((10-1)+1)*Math.random()+1);
			System.out.println(w);
		}*/
		DateFormat df= new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss");
		Date d= new Date();
		String time=df.format(d);
		System.out.println(time);

	}

}
