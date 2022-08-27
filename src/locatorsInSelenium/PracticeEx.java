package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/automation-practice-form");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
          
	       driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("varsha");
	       driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]")).sendKeys("pawar");
	       driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("asdfg@gmail.com");
	       driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
	       driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
	}

}
