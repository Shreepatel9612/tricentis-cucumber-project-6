package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    @When("I click on the Register link")
    public void iClickOnTheRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the text Register")
    public void iShouldSeeTheText() {
        Assert.assertEquals(new RegisterPage().getRegisterText(), "Register");
    }


    @And("I click on the Register button")
    public void iClickOnTheRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String er) {

        String actualErrorMessage = new RegisterPage().getValidationErrorMessageForField(er);
        Assert.assertEquals(actualErrorMessage,er);
    }

    @And("I select gender Female")
    public void iSelectGenderFemale() {

    }

    @And("I enter {string} in the first name field")
    public void iEnterInTheFirstNameField(String arg0) {
    }

    @And("I enter {string} in the last name field")
    public void iEnterInTheLastNameField(String arg0) {
    }

    @And("I enter {string} in the confirm password field")
    public void iEnterInTheConfirmPasswordField(String arg0) {
    }
}
