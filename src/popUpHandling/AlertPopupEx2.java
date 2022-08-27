package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		//driver.switchTo().alert().accept();
		
		////explicitwait
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
		Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("vhjhjj");
	driver.switchTo().alert().accept();
		
	

	}

}
