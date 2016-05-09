/**
 *  @author Gerardo Aponte
 * @class VerifyWordpressLoginPAPOM 
 * A class using Object Model (POM)
**/
package POM.Testcases;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import POM.LogginPagePAPOM;

/**
 * @author Gerardo Aponte
 *
 */
public class VerifyWordpressLoginPAPOM {

	@Test
	public void verifyValidLogin() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LogginPagePAPOM login =new LogginPagePAPOM(driver);
		
		login.loginToWordpress("admin", "demo123");
		driver.quit();
	}
}
