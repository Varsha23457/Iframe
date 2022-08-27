package PracticeSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AirIndia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement manage = driver.findElement(By.xpath("//body/form[@id='form1']/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(manage).build().perform();
		
		driver.findElement(By.xpath("(//a[text()='Star Alliance Seat Assignment'])[2]")).click();
		
		//driver.findElement(By.xpath("//input[@id='PNR']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("varsha");
		
		
		

	}

}
