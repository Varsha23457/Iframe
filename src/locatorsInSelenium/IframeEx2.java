package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx2 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/nisha/Desktop/Html/SecondWebpage.html");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.findElement(By.xpath("//input[@id='vrdfg']")).sendKeys("v");
	  
	  //switch from main page to frame1
	WebElement frame_web = driver.findElement(By.xpath("//iframe[@id='123']"));
	  driver.switchTo().frame(frame_web);
	  
	  driver.findElement(By.xpath("//input[@id='1233']")).sendKeys("1234567890");
	  
	  //switch from frame to main page
	  
	  driver.switchTo().parentFrame();
	  
	  driver.findElement(By.xpath("//input[@id='hth']")).sendKeys("N");
	  
	  //switch from main page to frame2
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("//input[@id='nhvv']")).sendKeys("A");
	  
	  //switch from frame 2 to main page
	  driver.switchTo().parentFrame();
	  driver.findElement(By.xpath("//input[@id='htfgh']")).sendKeys("beauty@123");
	  
	  //switch from main page to frame 2
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("//input[@id='gdgfhdg']")).sendKeys("50");
	  
	 //switch from frame 2 to main page
	  
	  driver.switchTo().parentFrame();
	  driver.findElement(By.xpath("//input[@id='htfghd']")).sendKeys("yuyu");
	   
	//switch to frame 1 from main page
	  
	 
	driver.switchTo().frame(frame_web);
  driver.findElement(By.xpath("//input[@name='hdg']")).sendKeys("IIT");

	}

}
