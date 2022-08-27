package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathEx {

	public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        WebElement search_box=driver.findElement(By.xpath("//input[@id='search_query_top']"));
        search_box.sendKeys("printed dress"+Keys.ENTER);
        Thread.sleep(2000);
        
        WebElement search_btn=driver.findElement(By.xpath("//body[@id='product']"));
        search_btn.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
	}
}
