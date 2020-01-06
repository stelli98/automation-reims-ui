package com.automation.ui.reims.steps;

import com.automation.ui.reims.pages.ManageUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ManagerUserSteps {

  ManageUserPage manageUserPage;

  @And("^the user choose '(.*)' for having vehicle$")
  public void theUserChooseForHavingVehicle(String hasVehicle) {
    manageUserPage.chooseHaveVehicle(hasVehicle);
  }

  @And("^the user click division '(.*)' in create user form$")
  public void theUserClickDivisionInCreateUserForm(String division) {
    manageUserPage.clickDivision();
    manageUserPage.chooseDivision(division);
  }

  @And("^the user click gender '(.*)' in create user form$")
  public void theUserClickGenderInCreateUserForm(String gender) {
    manageUserPage.clickGender();
    manageUserPage.chooseGender(gender);
  }

  @And("^the user click role '(.*)' in create user form$")
  public void theUserClickRoleUSERInCreateUserForm(String role) {
    manageUserPage.clickRole();
    manageUserPage.chooseRole(role);
  }

  @And("^the user click save new user$")
  public void theUserClickSaveNewUser() {
    manageUserPage.clickSaveButton();
  }

  @When("^the user press add user button$")
  public void theUserPressAddUserButton() {
    manageUserPage.clickAddUserButton();
  }

  @And("^the user select date of birth to first Date of Month in create user form$")
  public void theUserSelectDateOfBirthToFirstDateOfMonthInCreateUserForm() {
    manageUserPage.clickDateOfBirth();
    manageUserPage.selectDateOfBirthToFirstDateOfMonth();
    manageUserPage.clickOkAfterSelectDate();
  }

  @And("^the user type '(.*)' in vehicle input in create user form$")
  public void theUserTypeInVehicleInputInCreateUserForm(String vehicle) {
    manageUserPage.typeVehicle(vehicle);
  }

  @And("^the user type '(.*)' in license input in create user form$")
  public void theUserTypeInLicenseInputInCreateUserForm(String license) {
    manageUserPage.typeLicense(license);
  }

  @And("^the user type '(.*)' in  password input in create user form$")
  public void theUserTypeUsernameInPasswordInputInCreateUserForm(String password) {
     manageUserPage.typePassword(password);
  }

  @And("^the user type '(.*)' in username input in create user form$")
  public void theUserTypePasswordInUsernameInputInCreateUserForm(String username) {
    manageUserPage.typeUsername(username);
  }

  @And("^user press delete button inside '(.*)' user card of an user$")
  public void userPressDeleteButtonInsideBiancaUserCardOfAnUser(String username) {
    manageUserPage.clickDeleteUserCard(username);
  }

  @When("^user see '(.*)' user card$")
  public void userSeeUserCard(String username) {
    assertThat(manageUserPage.findUserCardByUsername(username),equalTo(Boolean.TRUE));
  }

  @Then("^user should be on manage user page$")
  public void userShouldBeOnManageUserPage() {
    manageUserPage.istxtListOfUserVisible();
  }

  @And("^user should not see '(.*)' user card$")
  public void userShouldNotSeeBiancaUserCard(String username) {
    assertThat(manageUserPage.findUserCardByUsername(username),equalTo(Boolean.FALSE));
  }
}
