package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {
    @When("I click on the COMPUTER tab")
    public void iClickOnTheCOMPUTERTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("I should see the text Computers")
    public void iShouldSeeTheTextComputers() {
    }

    @And("I click on the Desktops link")
    public void iClickOnTheDesktopsLink() {
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String arg0) {
    }

    @And("I click on the product name {string}")
    public void iClickOnTheProductName(String arg0) {
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String arg0) {
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String arg0) {
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String arg0) {
    }

    @And("I select OS {string}")
    public void iSelectOS(String arg0) {
    }

    @And("I select software {string}")
    public void iSelectSoftware(String arg0) {
    }

    @And("I click on the Add to Cart button")
    public void iClickOnTheAddToCartButton() {
    }
}
