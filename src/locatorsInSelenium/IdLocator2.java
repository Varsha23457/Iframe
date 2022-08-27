package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://automationpractice.com/index.php");
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
         
          //search box
          WebElement search_box=driver.findElement(By.id("search_query_top"));
         search_box.sendKeys("printed dress");
          
          search_box.click();
          
          //search button
          WebElement search_button=driver.findElement(By.name("submit_search"));
          search_button.click();
          
	}

}
