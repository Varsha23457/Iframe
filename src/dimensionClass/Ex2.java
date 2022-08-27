package dimensionClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       
	    Dimension d1 = driver.manage().window().getSize();
	       System.out.println(d1);
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       
	     Dimension d2 = driver.manage().window().getSize();
	     System.out.println(d2);
	     
	    Dimension d=new Dimension(200,500);
	    driver.manage().window().setSize(d);
	    

	}

}
