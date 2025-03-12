package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;

public class page2Objects extends browser {
	
// static By list=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li");
// 
// public static List<WebElement>listBar(){
//	 WebDriverWait wait2 = wait; new WebDriverWait(driver,Duration.ofSeconds(20));
//	 wait.until(ExpectedConditions.visibilityOfElementLocated(list));
//	 return driver.findElements(list);
// }
	@FindAll(@FindBy(xpath="//ul[@class='oxd-main-menu']/li"))
	@CacheLookup
	public List<WebElement>list;
	@FindBy(xpath="//span/h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	@CacheLookup
	public WebElement dashboard;
}
