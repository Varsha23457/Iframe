package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.LoginPage;

public class LoginPageTest extends LoginPage{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	LoginPageTest obj=new LoginPageTest();
		obj.sendinfotousername();
	}

}
