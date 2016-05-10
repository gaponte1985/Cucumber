/**
 * 
 */
package Cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gerardo Aponte
 *
 */
public class StepDefinitions {
	
	@Given("^I navigated to the zoo website$")
	public void ShouldNavigatedtoZooWebsite() throws Throwable {
		System.out.println("Excuted the navigate to zoo method");
	 
	}

	@When("^I click on the adoption link$")
	public void ShouldClickOnAdoption() throws Throwable {
	  
		System.out.println("Excuted the Click on the Adoption link");

	}

	@Then("^I check to see that no animals are avaible$")
	public void ShouldCheckAnimalsVisible() throws Throwable {
	   
		System.out.println("Excuted the the Animals Visible");

	}


}
