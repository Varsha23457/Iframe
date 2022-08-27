package selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShotsEx1.UtilClass1;

public class FirstAutoScript {

	public static void main(String[] args) throws IOException, InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\Downloads\\chromedriver_win32\\chromedriver.exe");   
         WebDriver driver=new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         UtilClass1.takeSS(driver,"varsha1");
         
         
         
         //getTitle
      //   String title=driver.getTitle();
       //  System.out.println(title);
         
         //get CurrentUrl
         
       // String url=driver.getCurrentUrl();
       // System.out.println(url);
        
        //get page source
      // String code=driver.getPageSource();
      //  System.out.println(code);
        
        
        
         
	}

}
