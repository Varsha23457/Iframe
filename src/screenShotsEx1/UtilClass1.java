package screenShotsEx1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass1 {
	
	public static void takeSS(WebDriver driver,String filename) throws IOException {
		String path = "C:\\Users\\nisha\\Documents\\screenshots";
		
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File des=new File (path+filename+".png");
	
	FileHandler.copy(src, des);
	
	
		
	}

}
