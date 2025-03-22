package seleniumClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class notepadAppend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\afree\\OneDrive\\Desktop\\t.txt";
		PrintWriter pw=new PrintWriter(new FileWriter(path,true));
		pw.println("How are you");
		pw.close();
		

	}

}
