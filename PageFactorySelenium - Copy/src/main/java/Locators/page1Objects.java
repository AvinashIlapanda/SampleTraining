package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Browser.browser;

public class page1Objects extends browser {
//	static By userNameEnter=By.name("username");
//	static By passwordEnter=By.name("password");
//    static By clickOnlogin=By.xpath("//button[@type='submit']");
//    public static WebElement username() {
//    	WebElement ele=driver.findElement(userNameEnter);
//    	return ele;
//    }
//   public static WebElement password() {
//	   WebElement ele=driver.findElement(passwordEnter);
//	   return ele;
//   }
//   public static WebElement login() {
//	   WebElement ele=driver.findElement(clickOnlogin);
//	   return ele;
//   }
	@FindBy(name="username")
	public WebElement name;
	@FindBy(name="password")
	public WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement button;
}

