package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement user_name=driver.findElement(By.id("email"));
		user_name.sendKeys("varsha@gmail.com");
		
	//password
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("asdfg123");
	Thread.sleep(2000);
	
	//click on login button
	WebElement login_btn=driver.findElement(By.linkText("Log In"));
	login_btn.click();
	Thread.sleep(2000);
	
	//link text
	WebElement fp=driver.findElement(By.linkText("Forgotten account?"));
	fp.click();
	Thread.sleep(2000);
	
	//partial link
	WebElement fp1=driver.findElement(By.partialLinkText("for acc"));
	fp1.click();
	driver.close();
	
		
		

	}

}
