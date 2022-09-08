#language:es
@Featureloginautomationtesting
Característica: Loguearme en la plataforma de automation testing
  Como usuario
  Quiero autenticarme en la plataforma de automation testing
  Para tener acceso a la aplicación

  @LoginExitoso
  Escenario: Login exitoso en la pagina de automation testing
    Dado que Marcela quiere ingresar a la plataforma de automation testing
    Cuando El escribe el usuario prueba123@gmail.com y la clave Aq1
    Entonces El ve el mensaje Hello