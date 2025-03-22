package seleniumClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.io.FileWriteMode;

public class notepadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DateFormat dt=new SimpleDateFormat("ddMMMYYHHmmss");
		Date d=new Date();
		String time=dt.format(d);
		String path="C:\\Users\\afree\\OneDrive\\Desktop\\"+time+".xlsx";
		//String pathfolder="C:\\Users\\afree\\OneDrive\\Desktop\\"+time+"1";//Creating folder time1
		File fc=new File(path);
		fc.createNewFile();
		//File foldercreate=new File(pathfolder);
		//foldercreate.mkdir();
		FileWriter fw=new FileWriter(path);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello Afreen, Welcome");
		bw.newLine();
		bw.write("code append");
		bw.newLine();
		bw.write("Successfull");
		bw.close();

	}

}
