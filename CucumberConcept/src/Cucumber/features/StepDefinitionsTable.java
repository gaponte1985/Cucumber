/**
 * 
 */
package Cucumber.features;

import java.util.List;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gerardo Aponte
 * @category Cucumber Step
 *
 */
public class StepDefinitionsTable {
	
	WebDriver driver = null;
	
	
	

	@Given("^I am on the zoo site$")
	public void shouldNavigateToZooSite() throws Throwable {
	   
		driver = new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
		driver.manage().window().maximize();
		
	}

	@When("^I navigate to contact$")
	public void shouldClickOnContactLink() throws Throwable {
		
		driver.findElement(By.id("contact_link")).click();
	   
	}

	@And("^I submit the form with valid data$")
	public void shouldPopulateContactForm(DataTable table) throws Throwable {
		
		//System.out.println(table);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath(".//*[@id='rinfo']")).click();
		driver.findElement(By.xpath(".//*[@id='cdona']")).click();
		driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("submit_message")).click();
		
	}

	@Then("^I check that the form has been submited$")
	public void i_should_be_on_the_contact_confirmation_page() throws Throwable {
		
		AssertJUnit.assertTrue("Not on contact confirmation page",
				driver.getTitle().equals("Contact Confirmation"));
		
	
		driver.close();
		
	   
	   
	}




}
