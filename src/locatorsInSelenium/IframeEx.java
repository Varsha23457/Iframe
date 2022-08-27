package locatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx {

	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32 (1)\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/nisha/Desktop/Html/SecondWebpage.html");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.findElement(By.xpath("//input[@id='vrdfg']")).sendKeys("varsha");
          driver.findElement(By.xpath("//input[@id='hth']")).sendKeys("pawar");
          
          
          //switch focus from main page to iframe
          driver.switchTo().frame(0);
          driver.findElement(By.xpath("//input[@name='gdhdh']")).sendKeys("9876543213");
          
          driver.findElement(By.xpath("//input[@name='hdg']")).sendKeys("MIT");
          
       //switch focus from iframe to main page
          
          driver.switchTo().parentFrame();
          driver.findElement(By.xpath("//input[@id='htfgh']")).sendKeys("anku@13.com");
          driver.findElement(By.xpath("(//input[@id='htfghd'])[1]")).sendKeys("arush123");
          driver.findElement(By.xpath("(//input[@id='htfghd'])[2]")).click();
          driver.findElement(By.xpath("(//input[@id='htfghd'])[3]")).click();
          driver.findElement(By.xpath("//input[@id=' gtdfh']")).click();
          
          Thread.sleep(2000);
          
        //  driver.findElement(By.xpath("")).click();
        //  Select s=new Select ()
          
          //switch focus from main page to frame2
         driver.switchTo().frame(1);
         driver.findElement(By.xpath("//input[@name='frg']")).sendKeys("Arush Jadhav");
          
         driver.findElement(By.xpath("//input[@id='gdgfhdg']")).sendKeys("20");
         
         Thread.sleep(2000);
         
        
         
         //switch to main page from frame2
         
          driver.switchTo().parentFrame();
        
          driver.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
          
          
List<WebElement> total_iframes = driver.findElements(By.tagName("iframe"));
	System.out.println(total_iframes.size());
	
	}

}
