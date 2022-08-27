package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9145152397");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dhanu24");
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='Varsha S Nishane']")).click();
	driver.findElement(By.xpath("//span[text()='Friends']")).click();
	driver.findElement(By.xpath("//span[text()='Delete'][1]")).click();
	     
           
	}

}
