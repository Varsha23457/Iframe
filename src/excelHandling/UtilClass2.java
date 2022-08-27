package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClass2 {
	
	public String getDataFromExcel(String sheetname, int r, int c) throws IOException   {
		String path = "C:\\Users\\nisha\\eclipse-workspace\\Automation1\\src\\excelHandling\\Book1.xlsx";
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		row.getCell(0);
		
		String data1 = sheet.getRow(1).getCell(0).getStringCellValue();
		return data1;
	}

}
