package locatorsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nisha/Desktop/Html/SecondWebpage.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='vrdfg']")).sendKeys("varsha");
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='123']"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//input[@name='gdhdh']")).sendKeys("8989");
             
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='frg']")).sendKeys("Ankush pawar");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
	}

}
