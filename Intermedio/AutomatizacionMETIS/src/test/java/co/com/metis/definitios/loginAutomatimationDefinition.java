package co.com.metis.definitios;

import co.com.metis.steps.login_automation_steps;
import co.com.metis.steps.login_metis_steps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class loginAutomatimationDefinition {
    @Steps
    login_automation_steps loginAutomationSteps;
    @Dado("^que Marcela quiere ingresar a la plataforma de automation testing$")
    public void queMarcelaQuiereIngresarALaPlataformaDeAutomationTesting() {

        loginAutomationSteps.abrirlaPagina();
    }

    @Cuando("^El escribe el usuario (.*) y la clave (.*)$")
    public void elEscribeElUsuarioPruebaGmailComYLaClaveAq(String usuario, String clave) {
        loginAutomationSteps.realizarlaAutenticacion(usuario, clave);

    }

    @Entonces("^El ve el mensaje Hello$")
    public void elVeElMensajeHello() {

    }


}
