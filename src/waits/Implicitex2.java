package waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Implicitex2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dimension d=new Dimension(900,500);
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		//driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("Raigad fort");

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\nisha\\Documents\\screenshots\\"+"google.png");
		FileHandler.copy(src, des);
		
		System.out.println("ss captured");
		
		driver.quit();
	}

}
