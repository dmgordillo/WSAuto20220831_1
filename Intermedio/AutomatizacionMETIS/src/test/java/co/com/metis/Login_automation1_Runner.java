package co.com.metis;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

public class Login_automation1_Runner {
    @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;

        }
    }

    @Test
    public void testRunner() {JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/Login_Automation1.feature",
            tags = "@LoginExitoso",
            glue = "co.com.metis.definitios",
            snippets = SnippetType.CAMELCASE)

    public class CRunnerPedido {
    }
}


