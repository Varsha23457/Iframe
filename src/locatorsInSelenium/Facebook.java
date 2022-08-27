package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php");
	    
	    driver.findElement(By.xpath("//input[contains(@id,'u_0_j_')]")).sendKeys("David");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@id,'u_0_l')]")).sendKeys("Tom");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@id,'u_0_o')]")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@id,'password_step_inpu')]")).sendKeys("abcd");
	    Thread.sleep(2000);
	    
	  WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	   Select sd=new Select(day);
		sd.selectByIndex(1);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select (month);
		sm.selectByValue("1");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select sy=new Select(year);
		sy.selectByVisibleText("1997");
		
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("Tom@123gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
		Thread.sleep(2000);
        
		driver.quit();
	}

}
