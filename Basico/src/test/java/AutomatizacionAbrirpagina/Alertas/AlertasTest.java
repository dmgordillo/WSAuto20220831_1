package AutomatizacionAbrirpagina.Alertas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static AutomatizacionAbrirpagina.Constantes.URL_AUTOMATION_TESTING_ALERTS;

public class AlertasTest {
    private static WebDriver driver;

    @Before
    public void Configuracion(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void alertas1() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get(URL_AUTOMATION_TESTING_ALERTS);
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
    }
@Test
    public void alertasokcancel()throws InterruptedException {

        driver.manage().window().maximize();
        driver.get(URL_AUTOMATION_TESTING_ALERTS);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals("You pressed Ok",driver.findElement(By.id("demo")).getText());
        Thread.sleep(5000);

        //Cancel
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        alert.dismiss();
      Assert.assertEquals("You Pressed Cancel",driver.findElement(By.id("demo")).getText());
        Thread.sleep(10000);

    }
    @After
    public void finalizar(){
        driver.close();
        driver.quit();
    }
}
