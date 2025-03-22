package seleniumClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelReader {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		String xlpath="C:\\Users\\afree\\OneDrive\\Desktop\\Selenium Class\\sel.xls";
		FileInputStream fio=new FileInputStream(xlpath);
		Workbook wb=Workbook.getWorkbook(fio);
		Sheet s=wb.getSheet(0);
//		int rows=s.getRows();
//		int cols=s.getColumns();
//		System.out.println("The noof rows in excel is "+rows);
//		System.out.println("The noof cols in excel is "+cols);
//		for(int irows=0;irows<rows;irows++) {
//			for(int icols=0;icols<cols;icols++) {
//				System.out.println(s.getCell(icols,irows).getContents());
//			}
//			System.out.println("**************************");
//		}
		System.out.println(s.getCell(1,3).getContents());

	}

}
