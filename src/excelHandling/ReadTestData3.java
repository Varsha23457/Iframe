package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData3 {

	public static void main(String[] args) throws IOException {
	String path = "C:\\Users\\nisha\\Documents\\Excel test data\\Book1.xlsx";
	
	File file=new File(path);
	FileInputStream fis=new FileInputStream (file);
    XSSFWorkbook wb=new  XSSFWorkbook(fis);
    XSSFSheet sheet=wb.getSheetAt(0);
    XSSFRow row=sheet.getRow(1);
    XSSFCell cell=row.getCell(0);
    
   String data1 = sheet.getRow(1).getCell(0).getStringCellValue();
   System.out.println(data1);
   
   String data2 = sheet.getRow(1).getCell(1).getStringCellValue();
   System.out.println(data2);
   
   
int row_count=sheet.getLastRowNum()+1;
System.out.println(row_count);

int cell_count=row.getLastCellNum();
System.out.println(cell_count);


for(int i=0;i<row_count;i++) {
	for(int j=0;j<cell_count;j++) {
		String data3 = sheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(data3+    "   ");
	}
	System.out.println();
}

	}

}
