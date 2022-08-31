package AutomatizacionAbrirpagina.Ventanas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ventanastesting {
    private static WebDriver driver;

    @Before
    public void Configuracion(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openPesTabWindows() throws InterruptedException {
        driver.manage().window().maximize();
        //driver.navigate().to(URL_AUTOMATION_TESTING_VENTANAS);
        driver.findElement(By.xpath("//*[@id='Tabbed']//button")).click();

        String ventaInicial = driver.getWindowHandle();

        for(String manejadorDeVentanas: driver.getWindowHandles()){
            driver.switchTo().window(manejadorDeVentanas);
            System.out.println("Titulo de la ventana: " + driver.getTitle());
            System.out.println("Identificador ventana: " + manejadorDeVentanas);
        }

        Assert.assertEquals("Selenium automates browsers. That's it!",
                driver.findElement(By.xpath("//*[@id='td-cover-block-0']/div/div/div/div/h1")).getText());
    }

    //private static WebDriver driver;

    /*@Before
    public void Configuracion(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }*/

    @Test
    public void openNewTabWindows() throws InterruptedException {
        driver.manage().window().maximize();
        //driver.navigate().to(URL_AUTOMATION_TESTING_VENTANAS);
        driver.findElement(By.xpath("//*[@id='Tabbed']//button")).click();

        String ventaInicial = driver.getWindowHandle();

        for(String manejadorDeVentanas: driver.getWindowHandles()){
            driver.switchTo().window(manejadorDeVentanas);
            System.out.println("Titulo de la ventana: " + driver.getTitle());
            System.out.println("Identificador ventana: " + manejadorDeVentanas);
        }

        Assert.assertEquals("Selenium automates browsers. That's it!",
                driver.findElement(By.xpath("//*[@id='td-cover-block-0']/div/div/div/div/h1")).getText());
    }


    @After
    public void finalizar(){
        driver.close();
        driver.quit();
    }
}


