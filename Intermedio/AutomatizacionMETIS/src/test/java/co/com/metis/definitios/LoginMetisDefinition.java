package co.com.metis.definitios;

import co.com.metis.steps.login_metis_steps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginMetisDefinition {
  @Steps
  login_metis_steps loginMetisSteps;
  @Dado("^que Marcela quiere ingresar a Metis$")
    public void queMarcelaquiereingresaraMetis(){
       loginMetisSteps.abrirlaPagina();
  }

    @Cuando("^El escribe el usuario (.*) y la clave (.*)$")
    public void Elescribeelusuarioejercicioylaclaveejercicio (String usuario, String password){
       loginMetisSteps.realizarlaAutenticacion(usuario,password);
    }

    @Entonces("^El ve el mensaje (.*)$")
    public void ElveelmensajeBootstrapAdminTemplate (){
       loginMetisSteps.verificarelAccesoexitoso("Bootstrap-Admin-Template");
    }
}
