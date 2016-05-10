
package Cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gerardo Aponte
 *
 */
public class StepDefinitionsPametros {
	
	

WebDriver driver = null;
	
	@Given("^I am on the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
	   
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void shouldClickOnLink(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	    
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	
	}

	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
	  driver.close();
	}
}
