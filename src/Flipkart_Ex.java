import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
//		driver.switchTo().frame(frame);
//	WebElement bse = driver.findElement(By.xpath("//span[@id='bseindex']"));
//	String value=bse.getText();
//		
//		System.out.println(value);
//		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
     Actions act=new Actions(driver);
     act.moveToElement(Fashion).build().perform();
     
     
     
    WebElement Women_ethnic = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[3]"));
    act.moveToElement(Women_ethnic).build().perform();
    
    driver.findElement(By.xpath("//a[text()='Women Dresses']")).click();
    
   // driver.findElement(By.xpath("//img[@class='_2r_T1I'])[5]")).click();
    
   
	}

}
