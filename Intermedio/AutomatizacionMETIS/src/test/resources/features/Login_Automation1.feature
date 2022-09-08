#language:es
@FeatureLoginAutomation1
Característica: Loguearme en la plataforma de automation testing
  Como usuario
  Quiero autenticarme en la plataforma de automation testing
  Para tener acceso a la aplicación
  
  @LoginExitosoDatoDrivel
  Escenario: Login exitoso en la pagina de automation testing
    Dado que Marcela quiere ingresar a la plataforma de automation testing
    Cuando El escribir las credenciales
      |user|pass|
      |demo|demo|

    Entonces Valida el mensaje login
      |mensaje|
      |Hello|