package com.swag.pe.definitions;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validation.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario abre la plataforma AnatomyIA")
    public void userNavigateTo() {
        url.navigateTo("http://localhost:8000/login");
    }

    @When("ingresa su correo {string} y contrasena {string}")
    public void userLoginWithCredentials(String email, String password) {
        login.typeEmail(email);
        login.typePassword(password);
        login.clickLogin();
    }

    @Then("deberia ingresar al panel principal de AnatomyIA")
    public void systemShowDashboard() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @Then("deberia visualizar un mensaje de error de autenticacion")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorIsVisible());
    }
}