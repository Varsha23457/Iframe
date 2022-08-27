package windowHandlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone13"+Keys.ENTER);
		 driver.navigate().refresh();
		 
		 driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
		 
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 
		 //parent id
		 String parent_id = driver.getWindowHandle();
		 System.out.println(parent_id);
		 
		 //child id
		 
		Set<String> child_id = driver.getWindowHandles();
		
		
		for(String a:child_id) {
			System.out.println(a);
			
			if(parent_id.equals(a)) {
				
			}
			
			else {
				driver.switchTo().window(a);
				
				driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
				System.out.println("product is added to cart");
				
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_id);
		System.out.println(driver.getTitle());
	}

}
