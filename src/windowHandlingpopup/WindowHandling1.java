package windowHandlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mi phone"+Keys.ENTER);
		 
		 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		 
		 //parent id
		 
		 String parent_id = driver.getWindowHandle();
		 System.out.println(parent_id);
		 
		 //child id
		 
		 Set<String> child_id = driver.getWindowHandles();
		 
		 for(String a:child_id) {
			 System.out.println(a);
			 if(parent_id.equals(a))
			 {
				 
			 }
			 else
			 {
				 driver.switchTo().window(a);
				 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				 System.out.println("product is added to cart");
				 Thread.sleep(2000);
				 driver.close();
				 
			 }
		 }
		 
		 driver.switchTo().window(parent_id);
		 System.out.println(driver.getTitle());
		
		
	}

}
