/**
 *  @author Gerardo Aponte
 * @class LogginPagePAPOM
 * A class using Object Model (POM) store all locator and methods 
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
public class LogginPagePAPOM {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath (".//*[@id='user_pass']");
	By loginButton =By.name("wp-submit");
	
	public LogginPagePAPOM(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	public void loginToWordpress(String userid, String pass)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
  
}
