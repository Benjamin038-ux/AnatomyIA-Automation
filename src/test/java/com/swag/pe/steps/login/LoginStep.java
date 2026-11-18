package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar correo")
    public void typeEmail(String email) {
        enterEmail(email);
    }

    @Step("Ingresar contrasena")
    public void typePassword(String password) {
        enterPassword(password);
    }

    @Step("Hacer clic en iniciar sesion")
    public void clickLogin() {
        clickLoginButton();
    }
}