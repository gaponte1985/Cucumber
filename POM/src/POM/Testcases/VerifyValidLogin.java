/**
 * @author Gerardo Aponte
 * @class VerifyValidLogin
 * A Test case using Object Model (POM) using Page Factory 
 */
package POM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import POM.LogginPageNew;

/**
 * @author Gerardo Aponte
 *
 */
public class VerifyValidLogin {

	@Test
	public void checkValidUser()
	{
	
	//This will launch browser and specific the url	
	WebDriver driver=BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
	
	//Created Page Object using Page Factory
	LogginPageNew login_page = PageFactory.initElements(driver, LogginPageNew.class);
	
	//LogginPage login_page_old =PageFactory.initElements(driver, LogginPage.class);
	
	//Calling the Method
	login_page.login_wordpress("admin", "demo123");
	
	}
}
