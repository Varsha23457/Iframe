package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://demoblaze.com/");
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
     driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
    Thread.sleep(2000);
    
  //  driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
   // Thread.sleep(2000);

    driver.findElement(By.xpath("(//a[@class='nav-link'])[5]")).click();
    Thread.sleep(2000);
    
  WebElement user_name =driver.findElement(By.id("loginusername"));
  user_name.sendKeys("varsha123gmail.com");
  
  WebElement password=driver.findElement(By.id("loginpassword"));
  password.sendKeys("vdrdfg");
  
	}
    
    
	

}
