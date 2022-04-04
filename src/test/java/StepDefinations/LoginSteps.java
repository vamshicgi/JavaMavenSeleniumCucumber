package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on Login Page");
	}

	@When("user entered userid and password")
	public void user_entered_userid_and_password() {
		System.out.println("User entered userid and password");
	}

	@And("user clicked on login buttion")
	public void user_clicked_on_login_buttion() {
		System.out.println("User clicked on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User successfully navigated to Home page. Hence test case is success");

	}
}
