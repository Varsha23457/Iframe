package PracticeSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkarttEx {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.close();
        driver.quit();
        
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
    WebElement element = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();

	}

}
