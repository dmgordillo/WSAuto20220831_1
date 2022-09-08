package co.com.metis.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class Loginmetispage extends PageObject {
   @FindBy(xpath = "//input[@placeholder='username']")
    WebElementFacade TXT_USUARIO;

    @FindBy(xpath = "//input[@placeholder='password']")
    WebElementFacade TXT_PASSWORD;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    WebElementFacade BTN_SUBMIT;

    @FindBy(id = "Bootstrap-Admin-Template")
    WebElementFacade LBL_TITULO;

    public void autenticarme(String usuario, String password){
        TXT_USUARIO.sendKeys(usuario);
        TXT_PASSWORD.sendKeys(password);
        BTN_SUBMIT.click();
    }

    public void verificarTitulo(String titulo) {
        MatcherAssert.assertThat(LBL_TITULO.getText(),containsText(titulo));
    }

}
