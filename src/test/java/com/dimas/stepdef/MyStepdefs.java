package com.dimas.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user input email text box with {string}")
    public void userInputEmailTextBoxWith(String arg0) {
    }

    @And("user input password text box with {string}")
    public void userInputPasswordTextBoxWith(String arg0) {
    }

    @And("user click login button")
    public void userClickLoginButton() {
    }

    @Then("User will redirect to homepage")
    public void userWillRedirectToHomepage() {
    }
}
