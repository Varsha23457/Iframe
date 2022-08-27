package PracticeSites;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShotsEx1.UtilClass;

public class FlipkartEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("waterfilters"+Keys.ENTER);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
		//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id );
	Set<String> child_id = driver.getWindowHandles();
//	System.out.println(child_id );
	
	for(String a:child_id) {
		System.out.println(a);
		
		if(parent_id.equals(a)){
			
		}
		else {
			driver.switchTo().window(a);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			System.out.println("product is added to cart");
			Thread.sleep(2000);
			driver.close();
			
			//UtilClass.takeSS(driver, "Flipkart111");
		}
	}
	
	driver.switchTo().window(parent_id);
	UtilClass.takeSS(driver, "Flipkart111");
	System.out.println(driver.getTitle());
	}

	
	
}
