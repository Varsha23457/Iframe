package screenShotsEx1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SsEx2 {

	public static void main(String[] args) throws IOException, InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.youtube.com/");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	 //  driver.findElement(By.xpath("//yt-formatted-string[text()='Music']")).click();
	   
	   Thread.sleep(2000);
	//  TakesScreenshot ts=(TakesScreenshot)driver;
	 // File src=ts.getScreenshotAs(OutputType.FILE);
	 // File des=new File ("C:\\Users\\nisha\\Documents\\screenshots\\"+"youtube.jpg");
	 // FileHandler.copy(src, des);
	  
	 // System.out.println("Screenshot is captured");
	   
	  // UtilClass.takeSS(driver,"explore of youtube");
	   driver.findElement(By.xpath("//span[text()='Explore']"));
	  // UtilClass.takeSS(driver,"Explore1");
	
	   UtilClass1.takeSS(driver,"Explore2");
	  

	}

}
