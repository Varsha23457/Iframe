package PracticeSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
			driver.findElement(By.xpath("//button[text()='Not Now']")).click();
			
			driver.findElement(By.xpath("//input[@class='sc-kVrTmx drALlH']")).sendKeys("Pune"+Keys.ENTER);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		driver.findElement(By.xpath("//div[text()='JugJugg Jeeyo']")).click();
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		
		//driver.findElement(By.xpath("//a[text()='Offers']")).click();
		
		

	}

}
