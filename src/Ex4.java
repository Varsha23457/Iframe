import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4 {                             //mouse hover

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//div[text()='Beauty']")).click();
		
		driver.navigate().refresh();
		
	WebElement Web_element = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act=new Actions(driver);
		act.moveToElement(Web_element).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Precious Jewellery']")).click();
		
		
	

	}

}
