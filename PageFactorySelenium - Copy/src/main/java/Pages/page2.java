package Pages;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.page1Objects;
import Locators.page2Objects;

public class page2 extends browser{
	
	static page2Objects obj;
	public static String username() {
		obj=new page2Objects();
		wait=new WebDriverWait(browser.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(obj.dashboard));
		return obj.dashboard.getText();
	}
	public static void optionclick(String data) throws Exception {
		obj=PageFactory.initElements(driver, page2Objects.class);
		Thread.sleep(2000);

	List<WebElement> list =obj.list;
	
	for (int i = 0; i < obj.list.size(); i++) {
		//System.out.println(list.get(i).getText());
		if (obj.list.get(i).getText().equalsIgnoreCase(data))
		{
			obj.list.get(i).click();
			break;
		}
	}
		
	}	
}
		
 
	


