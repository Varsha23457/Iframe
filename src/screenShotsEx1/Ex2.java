package screenShotsEx1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ex2 {

	public static void main(String[] args) throws IOException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    String path ="C:\\Users\\nisha\\Documents\\screenshots\\";
	    File des=new File(path+"amazon4.png");
	    FileHandler.copy(src, des);
	    
	    System.out.println("ss is taken");
	    
	    driver.quit();
	    
	    

	}

}
