#language:es
Característica: Logueo en sucursal bancaria
  Como usuario del Banco
  Quiero acceder al portal del Banco
  Para realizar transacciones

  Antecedentes: Logueo APP
  que el usuario ingresa a la sucursal virtual

  @Escenario1
  Esquema del escenario:Logueo en la sucursal de manera exitosa
    Cuando él ingresa el usuario y la Contraeña
    Entonces él ve el mensaje Bienvenido a la sucursal bancaria

  @Escenario2
  Esquema del escenario:Logueo en la sucursal de manera exitosa
    Cuando él ingresa el usuario y la Contraeña
    Entonces él ve el mensaje usuario y/o contraseña incorrecta

    Ejemplos:
      |Usuario    |Contraseña   |Mensaje                                    |
      |correcta   |correcta     |Bienvenido a la sucursal bancaria          |
      |incorrecto |correcta     |Mensaje usuario y/o contraseña incorrecta  |
      |           |             |Campos obligatorios                        |
      |Correcto   |Incorrecto   |Mensaje usuario y/o contraseña incorrecta  |
      |           |Correcto     |Mensaje usuario y/o contraseña incorrecta  |
      |Correcto   |             |Mensaje usuario y/o contraseña incorrecta  |

    @Escenario3
    Esquema del escenario:Logueo en la sucursal de manera exitosa
      Cuando él ingresa el usuario y la Contraeña
        |correcta   |correcta              |
      Entonces él ve el mensaje
        |Bienvenido a la sucursal bancaria |
