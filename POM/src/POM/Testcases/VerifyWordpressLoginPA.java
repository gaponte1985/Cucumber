/**
 *  @author Gerardo Aponte
 * @class VerifyWordpressLoginPA
 * A class using Object Model (POM)
**/
package POM.Testcases;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.LogginPagePA;

/**
 * @author Gerardo Aponte
 *
 */
public class VerifyWordpressLoginPA {

	@Test
	public void verifyValidLogin() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LogginPagePA login =new LogginPagePA(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.ClickOnLoginButton();
		
		//driver.quit();
	}
}
