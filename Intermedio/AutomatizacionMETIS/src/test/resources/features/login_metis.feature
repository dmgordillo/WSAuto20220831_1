#language:es
  @Feature
Característica: Acceder al aplicativo METIS
  como usuario
  Quiero autenticarme en Metis
  Para tener acceso a la App

  @LoginExitoso
   Escenario: Login exitoso en Metis
    Dado que Marcela quiere ingresar a Metis
    Cuando El escribe el usuario ejercicio y la clave ejercicio
    Entonces El ve el mensaje Bootstrap-Admin-Template

  @LoginExitosoDatoDriven
  Escenario: Login exitoso en Metis
    Dado que Marcela quiere ingresar a Metis
    Cuando El escribe las credenciales
    Entonces El ve el mensaje Bootstrap-Admin-Template

