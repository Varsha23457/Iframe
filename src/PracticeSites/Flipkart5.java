package PracticeSites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

public class Flipkart5 {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
      WebElement web_frame = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
      driver.switchTo().frame(web_frame);
      
   WebElement Bse = driver.findElement(By.xpath("//span[@id='bseindex']"));
 String value = Bse.getText();
 System.out.println(value);
 
 
 driver.switchTo().parentFrame();
 driver.findElement(By.xpath("//a[text()='CRICKET']")).click();
 
 TakesScreenshot ts=(TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File des=new File("C:\\Users\\nisha\\Documents\\screenshots\\"+"rediff1.png");
 FileHandler.copy(src, des);
 
 
 JavascriptExecutor js=( JavascriptExecutor)driver;
js.executeScript("window.scrollBy(4000,5000");

driver.findElement(By.xpath("//a[text()='Online Shopping']")).click();
 
 
   
	}

	

	

}
