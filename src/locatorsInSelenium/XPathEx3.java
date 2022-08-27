package locatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com/");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         
         driver.findElement(By.xpath("(//a[contains(text(),'Customer Ser')])[1]"));
	}

}
