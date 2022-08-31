package AutomatizacionAbrirpagina.AutomatizacionRegistro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Registro {

    public static void main(String[] args) {
        //Paso 1 levantar la página

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");

        //Paso 2 ingresar al registro
        driver.findElement(By.linkText("My Account")).click();

        //Paso 3 diligenciar el formulario
        driver.findElement(By.id("reg_email")).sendKeys("juancho4@itc.com.co");
        driver.findElement(By.id("reg_password")).sendKeys("Aq1211111*?");
        driver.findElement(By.id("reg_password")).click();
        //Thread.sleep(5000);
        driver.findElement(By.name("register")).click();

                //Paso 4 Cuando esta registrar
                String mesagge = String.valueOf(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/text()")));
        if (!Objects.equals(driver.findElement(By.linkText("An account is already registered with your email address. Please login.")), mesagge)) {
            driver.findElement(By.id("username")).sendKeys("juancho1@itc.com.co");
            driver.findElement(By.id("password")).sendKeys("Aq1211111*?");
        } else {
            driver.findElement(By.linkText("Sign out")).click();
        }
        // else

        //Paso final

            driver.close();
            driver.quit();

    }
}