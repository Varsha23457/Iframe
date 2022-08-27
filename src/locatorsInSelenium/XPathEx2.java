package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       
	       driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("ankush123");
     driver.findElement(By.xpath("//input[contains(@id,'u_0_l')]")).sendKeys("ankush321");
	driver.findElement(By.xpath("//input[contains(@id,'u_0_o_')]")).sendKeys("1234567890");
	driver.findElement(By.xpath("//input[contains(@id,'password_step_')]")).sendKeys("abcd");
      driver.findElement(By.xpath("(//select[@name='birthday_day'])[1]")).sendKeys("02");
	
	
	}

}
