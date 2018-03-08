package cucumber.cucumberdemo;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnition {
	HomePage home;
	String url;

	@Given("^User launches the application$")
	public void launchApp() {

		home = new HomePage();
	}

	@When("^user enters the data for all fields$")
	public void enterAllData() {
		home.fillAllData();
	}

	@When("^user enters the data for mandatory fields$")
	public void enterMandatoryData() {
		home.fillMandatoryData();
	}
	@When("^user skips the data for mandatory fields$")
	public void skipData() {
		home.skipMandatoryData();
	}
	@When("^user submits the form$")
	public void submitform() {
		home.clickSubmit();
	}

	@Then("^positeve Response message will be displayed$")
	public void validatePMessage() {
		System.out.println(home.getValidMessage());
		Assert.assertEquals("Your message was sent successfully. Thanks.",
				home.getValidMessage());
		home.close();
	}
	@Then("^error Response message will be displayed$")
	public void validateeMessage() {
		System.out.println(home.getErrorMessage());
		Assert.assertEquals("Validation errors occurred. Please confirm the fields and submit it again.",
				home.getErrorMessage());
		home.close();
	}
	@When("^user clicks on footerhome$")
	public void clickfooterhomepage() {
		url=home.validatefooterhome();
	}
	@Then("^validate the homepageredirection$")
	public void validatefooterhome() {
		System.out.println(url);
		Assert.assertEquals("", url);
	}
	


}
