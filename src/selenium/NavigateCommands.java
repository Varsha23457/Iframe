package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.facebook.com/");
	      
	      Thread.sleep(3000);
	      
	      //navigate to
	      driver.navigate().to("https://www.amazon.com/");
	      Thread.sleep(3000);
	      
	      //back
	      driver.navigate().back();
	      Thread.sleep(3000);
	      
	      //forward
	      driver.navigate().forward();
	      Thread.sleep(3000);
	      
	      //reload
	      driver.navigate().refresh();
	      
	}

}
