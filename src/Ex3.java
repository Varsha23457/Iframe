import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
        Actions act=new  Actions(driver);
     
        
        act.doubleClick(element).build().perform();
        
                                 //double clicks
	}

}
