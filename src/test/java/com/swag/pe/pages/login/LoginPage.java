package com.swag.pe.pages.login;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(name = "email")
    protected WebElementFacade txt_email;

    @FindBy(name = "password")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btn_login;

    public void enterEmail(String email) {
        txt_email.type(email);
    }

    public void enterPassword(String password) {
        txt_password.type(password);
    }

    public void clickLoginButton() {
        btn_login.click();
    }
}