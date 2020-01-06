package com.automation.ui.reims.steps;

import com.automation.ui.reims.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {

  LoginPage loginPage;

  @Given("^user open Reims application$")
  public void userOpenReimsApplication() {
    loginPage.open();
  }

  @When("^the user type '(.*)' in username input$")
  public void theUserTypeInUsernameInput(String username) {
    loginPage.typeUsername(username);
  }

  @And("^the user enter '(.*)' in password input$")
  public void theUserEnterPasswordInput(String password) {
    loginPage.typePassword(password);
  }

  @And("^the user press login button$")
  public void theUserPressLoginButton() {
    loginPage.clickLoginButton();
  }

  @Then("^user should see logout option$")
  public void userShouldBeInManageUserPage() {
    assertThat("user must see logout",loginPage.isBtnLogoutAvailable());
  }
}
