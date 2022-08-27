package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestdataEx2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book1.xlsx";
		//file
		File file=new File(path);
		//fis
		FileInputStream fis=new FileInputStream(file);
        //workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		//row
		XSSFRow row=sheet.getRow(0);
		//cell
		XSSFCell cell=row.getCell(0);
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		
		//System.out.print(data+" ");
		
		String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(data1);
		
		int r1 = sheet.getLastRowNum();
		//System.out.println(r1);
		int Row_count = r1+1;
		//System.out.println(Row_count);
		
		
		int cell_count = row.getLastCellNum();
		//System.out.println(cell_count);
		
		for(int i=0;i<Row_count;i++) {
			for(int j=0;j<cell_count;j++) {
			data=sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(data+"  ");
			}
			System.out.println();
		}
	}

}
