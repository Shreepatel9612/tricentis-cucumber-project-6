package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {


    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String welcomeMsg) {
        welcomeMsg = "Welcome, Please Sign In!";
        String expectedMessage = welcomeMsg;
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @And("I enter {string} in the email field")
    public void iEnterInTheEmailField(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String errorMessage) {
        new LoginPage().getErrorMessage();
    }


    @Then("I should see the log out link displayed")
    public void iShouldSeeTheLogOutLinkDisplayed() {
    }

    @And("I click on the log out link")
    public void iClickOnTheLogOutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("I should see the login link displayed")
    public void iShouldSeeTheLoginLinkDisplayed() {
    }

}
