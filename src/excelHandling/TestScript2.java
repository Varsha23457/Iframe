package excelHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import screenShotsEx1.UtilClass;

public class TestScript2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		UtilClass2 ut1=new UtilClass2();
		String firstname = ut1.getDataFromExcel("sheet1", 1, 0);
		
		String password = ut1.getDataFromExcel("sheet1", 1, 1);
	
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
		
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sd=new Select(element);
		sd.selectByValue("2");
		
		Thread.sleep(2000);
		WebElement element_2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select(element_2);
		sm.selectByVisibleText("Jan");
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select sy=new Select(element3);  
		sy.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		UtilClass.takeSS(driver, "fb page1");
		System.out.println("ss captured");
	}

}
