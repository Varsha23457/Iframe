package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestDataExx4 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\Book2.xlsx";
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		
	double data = sheet.getRow(1).getCell(2).getNumericCellValue();
	System.out.println(data);
	
int row_count = sheet.getLastRowNum()+1;
System.out.println( row_count);

int cell_count = row.getLastCellNum();
System.out.println( cell_count);

for(int i=0;i<row_count;i++) {
	//System.out.println(i);
	for(int j=0;j<cell_count;j++) {
		XSSFCell XSSFCell_data1 = sheet.getRow(i).getCell(j);
		System.out.print(XSSFCell_data1);
	}
	
	System.out.println();
}
		
		

	}
	

}
