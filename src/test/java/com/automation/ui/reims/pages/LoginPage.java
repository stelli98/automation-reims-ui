package com.automation.ui.reims.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.43.139:5000/login")
public class LoginPage extends PageObject {

  @FindBy(id="login__username")
  private WebElementFacade txtInput;

  @FindBy(id="login__password")
  private WebElementFacade txtPassword;

  @FindBy(xpath="//input[@class='btn-white']")
  private WebElementFacade btnLogin;

  @FindBy(xpath="//div[contains(text(),'Logout')]")
  private WebElementFacade btnLogout;


  public void typeUsername(String username){
    txtInput.type(username);
  }

  public void typePassword(String password){
    txtPassword.type(password);
  }

  public void clickLoginButton(){
    btnLogin.click();
  }

  public boolean isBtnLogoutAvailable() {
    return btnLogout.isVisible();
  }

}
