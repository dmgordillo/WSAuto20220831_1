package AutomatizacionAbrirpagina.pagina;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirPagina {
    public static WebDriver driver;

    @Before

    public void Configuracion(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        this.driver =new ChromeDriver();
    }

    @Test
     public void abrirpaginatest(){
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");

    }

    @After
    public void finalizar (){
        driver.close();
        driver.quit();
    }


}
