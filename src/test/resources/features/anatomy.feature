Feature: Autenticacion en plataforma AnatomyIA

  Scenario: Inicio de sesion exitoso como estudiante
    Given el usuario abre la plataforma AnatomyIA
    When ingresa su correo "estudiante@universidad.edu" y contrasena "password123"
    Then deberia ingresar al panel principal de AnatomyIA

  Scenario: Inicio de sesion fallido con credenciales invalidas
    Given el usuario abre la plataforma AnatomyIA
    When ingresa su correo "falso@anatomyia.com" y contrasena "error123"
    Then deberia visualizar un mensaje de error de autenticacion