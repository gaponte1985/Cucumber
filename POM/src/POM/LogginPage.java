/**
 *  @author Gerardo Aponte
 * @class LogginPage
 * A class using Object Model (POM)
 */
package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Gerardo Aponte
 * 
 * This class will store all the locator and methods of login page
 *
 */
public class LogginPage {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath (".//*[@id='user_pass']");
	By loginButton =By.name("wp-submit");
	
	public LogginPage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	
	public void typeUserName() 
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword() 
	{
		driver.findElement(password).sendKeys("demo123");
	}
	public void ClickOnLoginButton() 
	{ 
		driver.findElement(loginButton).click();
	}

}
