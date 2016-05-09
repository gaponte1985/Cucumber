/**
 *  @author Gerardo Aponte
 * @class VerifyWordpressLogin
 * A class using Object Model (POM)
**/
package POM.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.LogginPage;

/**
 * @author Gerardo Aponte
 *
 */
public class VerifyWordpressLogin {

	@Test
	public void verifyValidLogin() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LogginPage login =new LogginPage(driver);
		login.typePassword();
		login.typeUserName();
		login.ClickOnLoginButton();
		
		driver.quit();
	}
}
