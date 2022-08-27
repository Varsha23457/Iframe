import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import screenShotsEx1.UtilClass;

public class Dropdownhandling {
	
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select (drop);
		s.selectByVisibleText("Baby");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
			UtilClass.takeSS(driver,"Amazon");
		
		
		
		
		driver.quit();
	}

}
