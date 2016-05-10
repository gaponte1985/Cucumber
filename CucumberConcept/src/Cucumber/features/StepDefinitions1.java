/**
 * 
 */
package Cucumber.features;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gerardo Aponte
 * @category Cucumber Step
 *
 */
public class StepDefinitions1 {
	
	WebDriver driver = null;
	
	@Given("^I am on my zoo websiste$")
	public void shouldNavigateToZooSite() throws Throwable {
	   
		driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
		driver.manage().window().maximize();
		
	}

	@When("^I click on the contact link$")
	public void shouldClickOnContactLink() throws Throwable {
		
		driver.findElement(By.id("contact_link")).click();
	   
	}

	@When("^populate the contact form$")
	public void shouldPopulateContactForm() throws Throwable {
		
		driver.findElement(By.name("name_field")).sendKeys("Fulanito Tal");
		driver.findElement(By.xpath(".//*[@id='rinfo']")).click();
		driver.findElement(By.xpath(".//*[@id='cdona']")).click();
		driver.findElement(By.name("address_field")).sendKeys("New York");
		driver.findElement(By.name("postcode_field")).sendKeys("10591");
		driver.findElement(By.name("email_field")).sendKeys("ny@hotmail.com");
		driver.findElement(By.id("submit_message")).click();
		
	}

	@Then("^I should be on the contact confirmation page$")
	public void i_should_be_on_the_contact_confirmation_page() throws Throwable {
		
		AssertJUnit.assertTrue("Not on contact confirmation page",
				driver.getTitle().equals("Contact Confirmation"));
		
		driver.close();
		
	   
	   
	}




}
