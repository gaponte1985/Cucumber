/**
 *  @author Gerardo Aponte
 * @class LogginPagePA
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
public class LogginPagePA {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath (".//*[@id='user_pass']");
	By loginButton =By.name("wp-submit");
	
	public LogginPagePA(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	
	public void typeUserName(String uid) 
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void ClickOnLoginButton() 
	{ 
		driver.findElement(loginButton).click();
	}

}
