package locatorsInSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class XPath4 {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       
	       driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("varsha");
	       driver.findElement(By.xpath("(//input[contains(@id,'u_0_')])[2]")).sendKeys("Nishane");
	       driver.findElement(By.xpath("//input[contains(@id,'u_0_o')]")).sendKeys("1234567890");
	       driver.findElement(By.xpath("//input[contains(@id,'password_step_')]")).sendKeys("varsha123");
	       
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("20");
         driver.findElement(By.xpath("(//select[@name='birthday_month'])")).sendKeys("january");
              driver.findElement(By.xpath("(//select[@id='year'])")).sendKeys("1997");
              driver.findElement(By.xpath("//label[text()='Female']")).click();
}
}