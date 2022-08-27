import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	WebElement element3 = driver.findElement(By.xpath("//div[@id='draggable']"));
        
	WebElement element4 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act=new Actions(driver);
	//act.clickAndHold(element1).moveToElement(element2).release().build().perform();
	
	act.dragAndDrop(element3, element4).build().perform();
	
	}

}
