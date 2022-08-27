import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2 {
    
	public static void main (String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions (driver);
		                            //right click by action class
		
		act.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
	
		
		
		
	}
}
