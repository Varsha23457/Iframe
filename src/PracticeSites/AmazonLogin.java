package PracticeSites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class AmazonLogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Dimension s1 = driver.manage().window().getSize();
      System.out.println(s1);
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
     Dimension s2 = driver.manage().window().getSize();
      System.out.println(s2);
      
     // Dimension d=new Dimension(200,400);
     // driver.manage().window().setSize(d);
      
    // Point p1 = driver.manage().window().getPosition();
    // System.out.println(p1);
     
    // driver.manage().window().setPosition(p1);
      
     
     WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
     Select s=new Select(dropdown);
     s.selectByIndex(4);
     
     
    List<WebElement> all_options = s.getOptions();
  int count = all_options.size();
  System.out.println(count);
  
  for(int i=0;i<count;i++) {
	String data = all_options.get(i).getText();
	 System.out.println(data);
  }
     
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     
     JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(200,300)");
     driver.findElement(By.xpath("(//a[text()='Your Account'])[1]")).click();
	
	}

}
