#language:es
Característica: Logueo en sucursal bancaria
  Como usuario del Banco
  Quiero acceder al portal del Banco
  Para realizar transacciones

Antecedentes: Logueo APP
  que el usuario ingresa a la sucursal


  @Escenario1
  Escenario: Logueo en la sucursal de manera exitosa
    Cuando él coloca las credenciales de usuario
    Entonces él accesa de manera exitosa

    @Escenario2
    Escenario: Logueo en la sucursal de manera fallida
    Cuando él coloca las credenciales de usuario incorrectamente
    Entonces él no pude ingresar a la sucursal
    Y mensaje usuario y/o contraseña incorrecta
