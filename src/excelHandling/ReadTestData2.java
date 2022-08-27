package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book1.xlsx";
       
		//file
		File file=new File(path);
		
		//fileinputstream
		FileInputStream fis=new FileInputStream(file);
		
		
		//xssfworkook
		XSSFWorkbook wb=new  XSSFWorkbook (fis);
		
		//create obj of xssfsheet
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//row
		XSSFRow row=sheet.getRow(0);
		
	String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		
	//row count
	
	int r1 = sheet.getLastRowNum();
	//System.out.print(r1);
	int row_count = r1+1;
	System.out.println(row_count);
	
	//cell count
	int cell_count = row.getLastCellNum();
	System.out.print(cell_count);
	
	
	for(int i=0;i<row_count;i++) {
		for(int j=0;j<cell_count;j++) {
			String data = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+   " ");
		}
		System.out.println();
	}
	}

}
