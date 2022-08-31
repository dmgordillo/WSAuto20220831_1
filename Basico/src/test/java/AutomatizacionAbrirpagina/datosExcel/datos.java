    package AutomatizacionAbrirpagina.datosExcel;

    import AutomatizacionAbrirpagina.Utilidades;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.apache.poi.ss.usermodel.Row;
    import org.apache.poi.ss.usermodel.Sheet;
    import org.apache.poi.ss.usermodel.Workbook;
    import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    import java.io.FileInputStream;
    import java.io.IOException;

    import static AutomatizacionAbrirpagina.Constantes.*;

    public class datos {
        private static WebDriver driver;

        @Before
        public void Configuracion() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @Test

        public void leerDatosExcel() throws InterruptedException, IOException {
            String rutaArchivo = "src/test/resources/Data/datos.xlsx";
            FileInputStream archivo = new FileInputStream(rutaArchivo);
            Workbook libro = new XSSFWorkbook(archivo); //Tomar el libreo del archivo
            Sheet hoja = libro.getSheetAt(0);
            //int numFilas = hoja.getLastRowNum();
            //System.out.println("Numero de numFilas " + numFilas);

            // for (int a =1; a<=numFilas; a++) {
            Row fila = hoja.getRow(1);//Parte desde la fila 2 en el archivo de excel ya que la fila 1 son los encabezados
            int rowCount = hoja.getLastRowNum() + hoja.getFirstRowNum();

            driver.manage().window().maximize();

            for (int i = 0; i < rowCount; i++) {
                fila = hoja.getRow(i + 1);
                driver.navigate().to(URL_KATALON);
                //Row fila = hoja.getRow(1);//Parte desde la fila 2 en el archivo de excel ya que la fila 1 son los encabezadosdriver.findElement(By.id(TXT_FIRST_NAME_ID)).sendKeys("" + fila.getCell(0));
                driver.findElement(By.id(TXT_FIRST_NAME_ID)).sendKeys("" + fila.getCell(0));
                driver.findElement(By.id(TXT_LAST_NAME_ID)).sendKeys("" + fila.getCell(1));
                driver.findElement(By.xpath(RBT_GENERO_XPATH)).click();
                driver.findElement(By.id(TXT_DOD_ID)).sendKeys("" + fila.getCell(2));
                driver.findElement(By.id(TXT_ADDRESS_ID)).sendKeys("" + fila.getCell(3));
                driver.findElement(By.id(TXT_EMAIL_ID)).sendKeys("" + fila.getCell(4));
                driver.findElement(By.id(TXT_PASSWORD_ID)).sendKeys("" + fila.getCell(5));
                driver.findElement(By.id(TXT_COMPANY_ID)).sendKeys("" + fila.getCell(6));
                driver.findElement(By.id(TXT_ROLE_ID)).sendKeys("" + fila.getCell(7));
                driver.findElement(By.xpath(SEl_EXPECTATION_XPATH)).click();
                driver.findElement(By.xpath(CKB_WAYS_XPATH)).click();
                driver.findElement(By.id(TXT_COMMENT_ID)).sendKeys("" + fila.getCell(8));
                driver.findElement(By.id("submit")).click();

                Utilidades.esperar(5);
            }
            archivo.close(); //Siempre al final se debe cerrar el archivo
        }

    @After
    public void finalizar(){
       driver.close();
       driver.quit();
    }
}

