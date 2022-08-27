package PracticeSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	driver.switchTo().alert().dismiss();
	
	//WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	//element.click();
	
	
	
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	
	
	
	
	
	
	}

}
