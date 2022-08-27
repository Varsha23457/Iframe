import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.navigate().refresh();
		Actions act=new Actions(driver);
	WebElement hover = driver.findElement(By.xpath("//a[text()='Login']"));
	act.moveToElement(hover).build().perform();
	
	//mouse hover
	
	
	WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(fashion).build().perform();

	}

}
