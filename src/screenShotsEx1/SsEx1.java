package screenShotsEx1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SsEx1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//take ss
		
		UtilClass.takeSS(driver,"youtube homepage");
		
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		UtilClass.takeSS(driver,"homePage");
		driver.quit();

	}

}
