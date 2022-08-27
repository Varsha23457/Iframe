import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoblaze.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	}

}
