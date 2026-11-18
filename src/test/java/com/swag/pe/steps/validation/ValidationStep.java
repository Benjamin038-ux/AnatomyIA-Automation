package com.swag.pe.steps.validation;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar ingreso al dashboard")
    public boolean titleIsVisible() {
        return dashboardIsVisible();
    }

    @Step("Validar mensaje de error en login")
    public boolean errorIsVisible() {
        return errorMessageIsVisible();
    }
}