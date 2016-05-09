/**
 * @author Gerardo Aponte
 * @class LogginPageNew
 * A class using Object Model (POM) using Page Factory 
 */
package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class LogginPageNew {
	
	WebDriver driver;
	
	public LogginPageNew (WebDriver ldriver)
	
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement  username;
	
	@FindBy(how=How.ID,using ="user_pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button; 
	
	@FindBy(how=How.LINK_TEXT,using ="Lost your password")
	@CacheLookup
	WebElement forgert_password_link;
	
	public void login_wordpress (String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
		
	}

}
