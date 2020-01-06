package com.automation.ui.reims.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@DefaultUrl("http://192.168.43.139:5000/users")
public class ManageUserPage extends PageObject {

  @FindBy(xpath = "//div[@class='bottom-navigation manage-user__navigation']")
  private WebElementFacade btnAddUser;

  @FindBy(xpath = "//div[contains(text(),'Save')]")
  private WebElementFacade btnSave;

  @FindBy(xpath = "//div[contains(@class,'user__list')]")
  private WebElementFacade divListOfUser;

  @FindBy(xpath = "//option[contains(text(),'Admin')]")
  private WebElementFacade selectAdmin;

  @FindBy(xpath = "//input[@class='vdatetime-input']")
  private WebElementFacade selectDateOfBirth;

  @FindBy(xpath = "//form[@class='user-form__form']/div[6]/select")
  private WebElementFacade selectDivision;

  @FindBy(xpath = "//option[contains(text(),'Female')]")
  private WebElementFacade selectFemale;

  @FindBy(xpath = "//option[contains(text(),'Finance')]")
  private WebElementFacade selectFinance;

  @FindBy(xpath = "//div[@class='vdatetime-calendar__month__day'][1]")
  private WebElementFacade selectFirstDateOfMonth;

  @FindBy(xpath = "//form[@class='user-form__form']/div[5]/select")
  private WebElementFacade selectGender;

  @FindBy(xpath = "//option[contains(text(),'Human Resource')]")
  private WebElementFacade selectHumanResource;

  @FindBy(xpath = "//option[contains(text(),'Male')]")
  private WebElementFacade selectMale;

  @FindBy(xpath = "//span[contains(text(),'No')]/input[@type='radio']")
  private WebElementFacade selectNoHasVehicle;

  @FindBy(xpath = "//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm']")
  private WebElementFacade selectOkAfterChooseDate;

  @FindBy(xpath = "//form[@class='user-form__form']/div[3]/select")
  private WebElementFacade selectRole;

  @FindBy(xpath = "//option[contains(text(),'Technology')]")
  private WebElementFacade selectTechnology;

  @FindBy(xpath = "//option[contains(text(),'User')]")
  private WebElementFacade selectUser;

  @FindBy(xpath = "//span[contains(text(),'Yes')]/input[@type='radio']")
  private WebElementFacade selectYesHasVehicle;

  @FindBy(xpath = "//form[@class='user-form__form']/div[8]/div[1]/input[1]")
  private WebElementFacade txtLicense;

  @FindBy(xpath = "//div[@class='heading manage-user__heading']")
  private WebElementFacade txtListOfUser;

  @FindBy(xpath = "//form[@class='user-form__form']/div[2]/input[1]")
  private WebElementFacade txtPassword;

  @FindBy(xpath = "//form[@class='user-form__form']/div[1]/input[1]")
  private WebElementFacade txtUsername;

  @FindBy(xpath = "//form[@class='user-form__form']/div[8]//div[2]//input[1]")
  private WebElementFacade txtVehicle;

  public void chooseDivision(String division) {
    switch (division) {
      case "TECHNOLOGY":
        selectTechnology.click();
        break;
      case "FINANCE":
        selectFinance.click();
        break;
      case "HUMAN RESOURCE":
        selectHumanResource.click();
        break;
    }
  }

  public void chooseGender(String gender) {
    switch (gender) {
      case "FEMALE":
        selectFemale.click();
        break;
      case "MALE":
        selectMale.click();
        break;
    }
  }

  public void chooseHaveVehicle(String hasVehicle) {
    switch (hasVehicle) {
      case "yes":
        selectYesHasVehicle.click();
        break;
      case "no":
        selectNoHasVehicle.click();
        break;
    }
  }

  public void chooseRole(String role) {
    switch (role) {
      case "ADMIN":
        selectAdmin.click();
        break;
      case "USER":
        selectUser.click();
        break;
    }
  }

  public void clickAddUserButton() {
    btnAddUser.click();
  }

  public void clickDateOfBirth() {
    selectDateOfBirth.click();
  }

  public void clickDivision() {
    selectDivision.click();
  }

  public void clickGender() {
    selectGender.click();
  }

  public void clickOkAfterSelectDate() {
    selectOkAfterChooseDate.click();
  }

  public void clickRole() {
    selectRole.click();
  }

  public void clickSaveButton() {
    btnSave.click();
  }

  public int findIndexOfUserCard(String username) {
    int totalUsersCard = findAll("//div[contains(@class,'user__list')]/div").size();
     List<String> usersList = findAll("//div[contains(@class,'user__username')]").stream()
        .map(webElementFacade -> webElementFacade.getText()).collect(Collectors.toList());
    String[] users = new String[10];
    usersList.toArray(users);
    return IntStream.range(1, totalUsersCard+1).filter(index -> username.equalsIgnoreCase(users[index-1])).findFirst().orElse(0);
  }

  public void clickDeleteUserCard(String username){
    int index = findIndexOfUserCard(username);
    find( "//div[contains(@class,'user__list')]/div["+index+"]/div[1]/div[2]").click();
  }

  public Boolean findUserCardByUsername(String username) {
    return find("//div[contains(@class,'user__list')]//*[contains(text(),'" + username + "')]").isCurrentlyVisible();
  }

  public void istxtListOfUserVisible() {
    txtListOfUser.isVisible();
  }

  public void selectDateOfBirthToFirstDateOfMonth() {
    selectFirstDateOfMonth.waitUntilClickable();
  }

  public void typeLicense(String license) {
    txtLicense.type(license);
  }

  public void typePassword(String password) {
    txtPassword.type(password);
  }

  public void typeUsername(String username) {
    txtUsername.type(username);
  }

  public void typeVehicle(String vehicle) {
    txtVehicle.type(vehicle);
  }

}
