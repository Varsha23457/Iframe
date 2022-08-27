package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(){
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	private WebElement username;
	 
	public void sendinfotousername() {
		username.sendKeys("nishanevarsha2141@gmail.com");
	}

}
