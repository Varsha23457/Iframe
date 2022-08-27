package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoblaze.com/");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       
 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("varsha123");
 
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("pawar123");
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//button[text()='Sign up']")).click();
 Thread.sleep(2000);
 
 driver.quit();

	}

}
