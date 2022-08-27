import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_com {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nisha\\Downloads\\Selenium path\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select s=new Select(drop_down);
        
        s.selectByIndex(4);
      List<WebElement> options = s.getOptions();
     int count = options.size();
     System.out.println(count);
     
     for(int i=0;i<count;i++) {
    	String s1=options.get(i).getText();
    	System.out.println(s1);
     }
	}

}
