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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UdemyPractice {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
WebElement drop = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"))  ;   
	Select s=new Select(drop);
	s.selectByIndex(6);
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//span[text()='LG 190 L 4 Star Inverter Direct-Cool Single Doo…']")).click();
	
	driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File ("C:\\Users\\nisha\\eclipse-workspace\\Automation1\\src\\PracticeSites\\Takess"+"Amazon.png");
    FileHandler.copy(src, des);
    System.out.println("ss taken ");
	driver.quit();
	
	
	}

}
