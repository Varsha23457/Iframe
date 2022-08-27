package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util {
	
	public String getDataFromExcel(String sheetName,int r,int c) throws IOException {
		String path="C:\\Users\\nisha\\eclipse-workspace\\Automation1\\src\\excelHandling\\Book1.xlsx";
	   
		//file
		File file=new File(path);
		
		//file InputStream
	FileInputStream fis=new FileInputStream(file);
	
	//workbook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	//sheet
	XSSFSheet sheet=wb.getSheet(sheetName);
	
	
	//row and column
	String data = sheet.getRow(r).getCell(c).getStringCellValue();
	
	return data;
	
	}

}
