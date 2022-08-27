import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5 {

	public static void main(String[] args) {
		//Click and hold
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(0);
		
		//src element
WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
	//target element

WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));

Actions act=new Actions(driver);

//act.clickAndHold(element1).moveToElement(element2).release().build().perform();

//drag and drop

      act.dragAndDrop(element1, element2).build().perform();

	}

}
