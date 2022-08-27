package screenShotsEx1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
	public static void takeSS(WebDriver driver1,String filename) throws IOException{
		String path = "C:\\Users\\nisha\\eclipse-workspace\\Automation1\\src\\screenShotsEx1";
		
	
		TakesScreenshot ts=(TakesScreenshot)driver1;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File(path+filename+".png");
		FileHandler.copy(src, des);
		
		//System.out.println("Screenshot taken successfully");
		
		
		
	}
}
