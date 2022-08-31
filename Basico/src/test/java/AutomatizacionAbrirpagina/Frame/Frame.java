package AutomatizacionAbrirpagina.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static AutomatizacionAbrirpagina.Constantes.*;
import static AutomatizacionAbrirpagina.Utilidades.esperar;

public class Frame {

    public static WebDriver driver;

    @Before
     public void configuracion (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test

    public void frame1 () throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(URL_AUTOMATION_TESTING_FRAMES);
        driver.switchTo().frame(FRAME1_ID);
        esperar(2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Primer frame");
        esperar(2);

    }
    @Test
    public void framedosframe () throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(URL_AUTOMATION_TESTING_FRAMES);
        driver.findElement(By.xpath(BTN_FRAME2_XPATH)).click();
        WebElement frame1 = driver.findElement(By.xpath(FRAME2_XPATH));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.xpath(FRAME3_XPATH));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath(FRAME4_XPATH)).sendKeys("Dos Frame");
        esperar(2);
    }

    @After

    public void finalizar(){
        driver.close();
        driver.quit();
    }
}
