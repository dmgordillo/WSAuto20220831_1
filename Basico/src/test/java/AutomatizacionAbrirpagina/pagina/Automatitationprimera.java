package AutomatizacionAbrirpagina.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class Automatitationprimera {

    public static void main(String[] args) {
        //Paso 1 configurar el driver google chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\PruebasAutomatizadas\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Paso 2. Maximizar la pagina
        driver.manage().window().maximize();

        //Paso 3. Abrir URL
        driver.get("https://automationtesting.in/");

        //paso 4. link
        driver.findElement(By.linkText("Demo Site")).click();
        //Thread.sleep(2000);


        // sendkeys

        // Paso Final, Cerrar driver
        driver.close();
        driver.quit();

    }
}


