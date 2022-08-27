package PracticeSites;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyntraWebsiteEx {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	

	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("Beauty");
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img'])[11]")).click();
	
driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-c')])[1]")).click();
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

String parent_id = driver.getWindowHandle();
System.out.println( parent_id);

Set<String> child_id = driver.getWindowHandles();
System.out.println( child_id);

for(String a:child_id) {
	System.out.println(a);
	if(parent_id.equals(a)) {
		
	}
	else {
		driver.switchTo().window(a);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		System.out.println("product is added to cart");
		Thread.sleep(2000);
		driver.close();
	}
	driver.switchTo().window(parent_id);
	System.out.println(driver.getTitle());
}

	}

}
