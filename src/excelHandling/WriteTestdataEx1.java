package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTestdataEx1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book1.xlsx";
           
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		//row
		sheet.getRow(0).createCell(2).setCellValue("Condition");
		sheet.getRow(1).createCell(2).setCellValue("pass");
		sheet.getRow(2).createCell(2).setCellValue("fail");
		sheet.getRow(3).createCell(2).setCellValue("pass");
		sheet.getRow(4).createCell(2).setCellValue("fail");
		
		//save data
		FileOutputStream fos=new FileOutputStream (file);
		wb.write(fos);
		wb.close();
		
		System.out.println("data saved successfully");
		
	}

}
