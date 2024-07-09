package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber {
	
	@Given("User is at login screen")
	public void preCondtions() {
	  System.out.println("Given is the preCondtions2");
	}

	@When("User Enters usernme")
	public void enterUserName() {
		System.out.println("Entering the user name");
	}

	@When("User Enter Password")
	public void enterPassword() {
		System.out.println("Entering the password");
	}

	@When("User click on login button")
	public void clickButton() {
		System.out.println("Click on the login button");
	}

	@Then("User should be logged in")
	public void loginConfirmation() {
		System.out.println("User should be logged in");
	}
	
	

}
