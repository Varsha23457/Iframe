package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestDataEx1 {

	public static void main(String[] args) throws IOException  {
		String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book1.xlsx";
        
		//create obj of file class
		File file=new File (path);
		
		//create obj of fileinputStream class
		FileInputStream fis=new FileInputStream(file);
		
		//create obj of XSSFworkbook class
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//create obj of XSSFSheet class
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//create obj of xssfRow class
		
		XSSFRow row=sheet.getRow(0);
		
		//create object of xssfcell class
		 XSSFCell cell = row.getCell(0);
		
String data0=	cell.getStringCellValue();
System.out.println(data0);

String data1=sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(data1)	;
	
	String data2 = wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		String data3=sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(data3);
		
		String data4 = wb.getSheetAt(0).getRow(2).getCell(1).getStringCellValue();
		System.out.println(data4);
		
	//	int i;
		//int j;
		
		//for(i=1;i<=5;i++) {
		//	for(j=1;j<=2;j++) {
				
				
			//}
			
			
		//}
	
		
	}

}
