import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClassEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://marathi.abplive.com/");
	Point p1=driver.manage().window().getPosition();
	System.out.println(p1);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Point p=new Point (500,200);
		driver.manage().window().setPosition(p);
		
		

	}

}
