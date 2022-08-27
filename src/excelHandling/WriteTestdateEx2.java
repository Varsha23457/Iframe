package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTestdateEx2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book2.xlsx";
		File file =new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		sheet.getRow(0).createCell(0).setCellValue("Sr.No");
		sheet.getRow(0).createCell(4).setCellValue("Result");
		sheet.getRow(1).createCell(4).setCellValue("pass");
		sheet.getRow(2).createCell(4).setCellValue("fail");
		sheet.getRow(3).createCell(4).setCellValue("pass");
		sheet.getRow(4).createCell(4).setCellValue("fail");
		sheet.getRow(5).createCell(4).setCellValue("pass");
		
		sheet.getRow(0).createCell(5).setCellValue("Mobile number");
		sheet.getRow(1).createCell(5).setCellValue("9878765");
		sheet.getRow(2).createCell(5).setCellValue("67876");
		sheet.getRow(3).createCell(5).setCellValue("56677");
		sheet.getRow(4).createCell(5).setCellValue("9/8/2022");
		sheet.getRow(5).createCell(5).setCellValue("3/7/2022");
		
		FileOutputStream fos=new FileOutputStream (file);
		wb.write(fos);
		System.out.println("Data saved");

	}

}
