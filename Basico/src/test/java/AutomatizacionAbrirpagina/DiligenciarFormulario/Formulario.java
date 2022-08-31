package AutomatizacionAbrirpagina.DiligenciarFormulario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.URI;
import java.net.URL;
import java.sql.Driver;

public class Formulario {
    public static void main(String[] args) throws InterruptedException {
        //Paso 1 levantar la página
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        //Paso 2 diligenciar formulario
        driver.findElement(By.id("first-name")).sendKeys("Federico");
        driver.findElement(By.id("last-name")).sendKeys("Ramirez");
        driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input")).click();
        driver.findElement(By.id("dob")).sendKeys("02/02/1990");
        driver.findElement(By.id("address")).sendKeys("Calle 127");
        driver.findElement(By.id("email")).sendKeys("federico@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Aq1*");
        driver.findElement(By.id("company")).sendKeys("IBM");
        driver.findElement(By.id("role")).sendKeys("Manager");
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[5]/label")).click();
        driver.findElement(By.id("comment")).sendKeys("Comentario");
        driver.findElement(By.id("submit")).click();

//Paso final

       driver.close();
       driver.quit();

    }
}
