package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.page1Objects;

public class page1 extends browser{
	public static String Title() {
		return driver.getTitle();
	}
	static page1Objects obj;
	public static void userNameEnter(String data) throws Exception{
		obj=PageFactory.initElements(driver,page1Objects.class);
		 wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable((obj.name)));
		 obj.name.sendKeys(data);
			
		 
		
	}
	public static void passwordEnter(String data) throws Exception{
		obj.pass.sendKeys(data)	;
	}
	public static void clickLogin()throws Exception {
		obj.button.click();
	}

}
