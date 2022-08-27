package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScript {

	public static void main(String[] args) {
      
   System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");

}
}