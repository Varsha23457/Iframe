package popUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//switch focus of selenium from main page to popup
		//driver.switchTo().alert().accept();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		//switch focus of selenium from main page to popup
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		//switch focus of selenium from main page to popup
	driver.switchTo().alert().sendKeys("varsha");
		
		driver.switchTo().alert().accept();
		
		

	}

}
