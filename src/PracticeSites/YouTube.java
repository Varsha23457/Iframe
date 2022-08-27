package PracticeSites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	   
		
		driver.findElement(By.xpath("//input[@class='sc-jWojfa eTcNgn']")).sendKeys("Pune"+Keys.ENTER);
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//img[@class='style-scope yt-img-shadow'])[4]")).click();

	}

}
