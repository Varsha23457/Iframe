package PracticeSites;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonEx {

	public static void main(String[] args) throws InterruptedException { 

 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    
  WebElement box = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
      Select s=new Select (box);
      
      Thread.sleep(2000);
      
      s.selectByVisibleText("Girls' Fashion");
      
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@id='a-autoid-2-announce']")).click(); 
      
      driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
      
      Thread.sleep(2000);
      
     String parent_id = driver.getWindowHandle();           //parent id
     System.out.println( parent_id);
     
    Set<String>child_id= driver.getWindowHandles();
    
    for(String a:child_id) {
    	System.out.println(a);
    	if(parent_id.equals(a)) {
    		
    	}
    	
    	else {
    		driver.switchTo().window(a);
    	 driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
      
    	 System.out.println("product is added to cart");
    	 Thread.sleep(2000);
      driver.close();
    	}
    }
    driver.switchTo().window(parent_id);
    System.out.println(driver.getTitle());
      
	}

}
