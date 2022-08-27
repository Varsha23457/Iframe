package PracticeSites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoQa {

	public static void main(String[] args) throws IOException {
	     
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://in.bookmyshow.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    TakesScreenshot ts=(TakesScreenshot)driver;
     
   File src= ts.getScreenshotAs(OutputType.FILE);
   
   File des=new File ("C:\\Users\\nisha\\Documents\\screenshots\\"+"book1.png");
   
   FileHandler.copy(src, des);
   System.out.println("ss was taken");
    
	}

}
