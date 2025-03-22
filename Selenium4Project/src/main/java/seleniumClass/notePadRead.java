package seleniumClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.util.BufferRecycler;

public class notePadRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\afree\\OneDrive\\Desktop\\t.txt";
		FileReader f=new FileReader(path);
		BufferedReader b=new BufferedReader(f);
		String a="";
		while((a=b.readLine())!=null) {
			System.out.println(a);
		}

	}

}
