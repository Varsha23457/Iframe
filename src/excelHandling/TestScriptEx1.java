package excelHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptEx1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Util ut=new Util();
		String username = ut.getDataFromExcel("sheet1",1,0);
		String password = ut.getDataFromExcel("sheet1", 1, 1);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
