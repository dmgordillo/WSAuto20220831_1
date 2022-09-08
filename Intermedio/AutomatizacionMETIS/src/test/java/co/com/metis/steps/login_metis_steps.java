package co.com.metis.steps;

import co.com.metis.pageobjects.Loginmetispage;
import net.thucydides.core.annotations.Step;

public class login_metis_steps {
    Loginmetispage loginmetispage;

    @Step
    public void abrirlaPagina(){
        loginmetispage.open();
    }

    public void realizarlaAutenticacion(String usuario, String password) {
        loginmetispage.autenticarme(usuario, password);
    }

    public void verificarelAccesoexitoso(String titulo) {
        loginmetispage.verificarTitulo(titulo);
    }

}


