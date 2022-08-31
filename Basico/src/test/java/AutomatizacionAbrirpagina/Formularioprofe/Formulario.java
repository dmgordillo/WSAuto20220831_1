package AutomatizacionAbrirpagina.Formularioprofe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static AutomatizacionAbrirpagina.Constantes.*;
import static org.junit.Assert.assertEquals;


public class Formulario {
    private static WebDriver driver;

    @Before
    public void Configuracion(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void authenticationExitosa() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(URL_AUTOMATION_TESTING_LOGIN);
        driver.findElement(By.id(TXT_USERNAME_AT_ID)).sendKeys("juancho4@itc.com.co");
        driver.findElement(By.id(TXT_PASSWORD_AT_ID)).sendKeys("Aq1211111*?");
        driver.findElement(By.name(BTN_LOGIN_AT_NAME)).click();
        Assert.assertEquals(TEXT_EXPOSITOR_AT_MENSA,driver.findElement(By.xpath(TXT_MENSA_BIENVENIDA_XPATH)).getText());
        Thread.sleep(5000);
    }

    @Test
       public void autenticacionFallida() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(URL_AUTOMATION_TESTING_LOGIN);
        driver.findElement(By.id(TXT_USERNAME_AT_ID)).sendKeys("juancho4@itc.com.co");
        Thread.sleep(5000);
        driver.findElement(By.id(TXT_PASSWORD_AT_ID)).sendKeys("clave");
        driver.findElement(By.name(BTN_LOGIN_AT_NAME)).click();
        //String
        //Assert.assertTrue(MENSAJE_NO_EXITOSO_AT.contains(driver.findElement(By.xpath(TXT_MENS_VALI_XPATH)))).getText();

    }


    @After
            public void finalizar(){
        driver.close();
        driver.quit();
    }
}
