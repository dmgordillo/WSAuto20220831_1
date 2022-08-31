package AutomatizacionAbrirpagina.LeerDatosExcelSQL;

import AutomatizacionAbrirpagina.ExcelManager;
import AutomatizacionAbrirpagina.Utilidades;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static AutomatizacionAbrirpagina.Constantes.*;

public class LeerExcelDatosSQLTest {

    private static WebDriver driver;
    private ExcelManager excelManager;

    @Before
    public void Configuracion(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        excelManager = new ExcelManager();
    }
    @Test
    public void LeerExcelDatosSQLTest() throws FilloException, InterruptedException {
        driver.manage().window().maximize();

        excelManager.strRutaArchivo("src/test/resources/Data/datos.xlsx"); // Conexión a excel
        String strQsl = "SELECT + FROM Hoja1";
        Recordset objRecord = excelManager.leerExcel(strQsl);
        System.out.println("La cantidad de registros en el archivo son:" + objRecord.getCount());


        while (objRecord.next()){
            driver.navigate().to(URL_KATALON);
            driver.findElement(By.id(TXT_LAST_NAME_ID)).sendKeys(objRecord.getField("Firstname"));
            driver.findElement(By.xpath(RBT_GENERO_XPATH)).click();
            driver.findElement(By.id(TXT_DOD_ID)).sendKeys(objRecord.getField("Lastname"));
            driver.findElement(By.id(TXT_ADDRESS_ID)).sendKeys(objRecord.getField("Address"));
            driver.findElement(By.id(TXT_EMAIL_ID)).sendKeys(objRecord.getField("Email"));
            driver.findElement(By.id(TXT_PASSWORD_ID)).sendKeys(objRecord.getField("Password"));
            driver.findElement(By.id(TXT_COMPANY_ID)).sendKeys(objRecord.getField("Company"));
            driver.findElement(By.id(TXT_ROLE_ID)).sendKeys(objRecord.getField("Role"));
            driver.findElement(By.xpath(SEl_EXPECTATION_XPATH)).click();
            driver.findElement(By.xpath(CKB_WAYS_XPATH)).click();
            driver.findElement(By.id(TXT_COMMENT_ID)).sendKeys(objRecord.getField("Comment"));
            driver.findElement(By.id("submit")).click();
            Utilidades.esperar(2);
        }
    }
    @After
    public void finalizar(){
        driver.close();
        driver.quit();
    }
}
