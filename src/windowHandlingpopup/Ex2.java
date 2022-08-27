package windowHandlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("whirlpool refrigerator water filter 1"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		 String parent_id = driver.getWindowHandle();           //parent id
	     System.out.println( parent_id);
	     
	    Set<String>child_id= driver.getWindowHandles();             //child id
	    
	    for(String a:child_id) {
	    	System.out.println(a);
	    	if(parent_id.equals(a)) {
	    		
	    	}
	    	
	    	else {
	    		driver.switchTo().window(a);
	    		Thread.sleep(2000);
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


