package AutomatizacionAbrirpagina.Formuprofe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

import static AutomatizacionAbrirpagina.Constantes.URL_KATALON;

public class FormularioPR {

    public static WebDriver driver;

    @Before

    public void Configuracion(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        this.driver =new ChromeDriver();
    }

    @Test
    public void abrirpaginatest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_KATALON);



    }

    @After
    public void finalizar (){
        driver.close();
        driver.quit();
    }
}
