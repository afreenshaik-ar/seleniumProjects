package seleniumClass;

import java.awt.Label;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
//import jxl.write.Label;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class excelWrite {

	public static void main(String[] args) throws IOException, RowsExceededException,WriteException {
		// TODO Auto-generated method stub
		String xlpath="C:\\Users\\afree\\OneDrive\\Desktop\\sele.xls";
		File fexcel=new File(xlpath);
		WritableWorkbook wwb=Workbook.createWorkbook(fexcel);
		wwb.createSheet("Affz", 0);
		wwb.createSheet("Sheet2", 1);
		wwb.createSheet("Sheet3", 2);
		WritableSheet ws=wwb.getSheet(0);
//		Label data11=new Label(4,2,"S.no");
//		ws.addCell(data11);
//		Writablesheet us=wwb.getSheet(0);
		wwb.write();
		wwb.close();

	}

}
