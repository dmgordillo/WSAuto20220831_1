package co.com.metis.steps;

import co.com.metis.pageobjects.loginAutomationPage;
import net.thucydides.core.annotations.Step;

public class login_automation_steps {
    loginAutomationPage LoginAutomationpage;
    @Step
    public void abrirlaPagina() {
        LoginAutomationpage.open();
    }


    public void realizarlaAutenticacion(String usuario, String clave) {
        LoginAutomationpage.autenticarme(usuario, clave);
    }
}
