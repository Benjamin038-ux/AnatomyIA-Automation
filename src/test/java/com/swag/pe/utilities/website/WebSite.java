package com.swag.pe.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class WebSite extends PageObject {

    @Step("Navegar a la pagina de login de AnatomyIA")
    public void navigateTo(String url) {
        openUrl(url);
    }
}