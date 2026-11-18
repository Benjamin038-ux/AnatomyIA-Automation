package com.swag.pe.pages.validations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//nav")
    protected WebElementFacade nav_dashboard;

    @FindBy(xpath = "//ul[contains(@class,'text-red')] | //p[contains(@class,'text-red')]")
    protected WebElementFacade lbl_errorMessage;

    public boolean dashboardIsVisible() {
    waitFor(2).seconds();
    return !getDriver().getCurrentUrl().contains("/login");
}

    public boolean errorMessageIsVisible() {
        return lbl_errorMessage.isCurrentlyVisible();
    }
}