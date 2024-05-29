package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {


    @Given("I am on the Trendyol homepage")
    public void ıAmOnTheTrendyolHomepage() throws InterruptedException {
        LoginPage.HomePage();
    }

    @When("I click the pop up X button")
    public void ıClickThePopUpXButton() throws InterruptedException {
        LoginPage.PopUp();
    }

    @When("I click the cookie accept button")
    public void ıClickTheCookieAcceptButton() {
        LoginPage.Cookie();
    }

    @When("I click the Sign In")
    public void ıClickTheSignIn() {
        LoginPage.SignIn();
    }

    @And("I enter a valid email address in the Email field \\(Must not be a previously registered email)")
    public void ıEnterAValidEmailAddressInTheEmailFieldMustNotBeAPreviouslyRegisteredEmail() {
        LoginPage.Email();
    }

    @And("I enter a valid password in the password field")
    public void ıEnterAValidPasswordInThePasswordField() {
        LoginPage.Password();
    }

    @And("I click the Sign In button")
    public void ıClickTheSignInButton() {
        LoginPage.SignIn();
    }

    @Then("I should see the user cannot log in successfully")
    public void ıShouldSeeTheUserCannotLogInSuccessfully() {
        LoginPage.Message();
    }

    @And("I should see the receives Your email address and-or password is incorrect warning appears")
    public void ıShouldSeeTheReceivesYourEmailAddressAndOrPasswordIsIncorrectWarningAppears() {
        LoginPage.Message();
    }


}
