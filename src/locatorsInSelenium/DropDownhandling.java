package locatorsInSelenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownhandling {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select (dropdown);
	s.selectByVisibleText("Books");
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	driver.findElement(By.xpath("//a[text()='Best Books of the Month']")).click();
	 driver.findElement(By.xpath("//a[@id='a-autoid-4-announce']")).click();
	 driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[3]")).click();
 //  driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[1]")).click();
   
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	String path=("C:\\Users\\nisha\\Documents\\screenshots\\");
     File des=new File (path+"\\amazon1.jpg");
     org.openqa.selenium.io.FileHandler.copy(src, des);
	 
	}

}
