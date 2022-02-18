# Sofka: usuario-ejemplo-crud
Implementación básica guiada de un CRUD para luego establecer mejoras.
Esta práctica consiste en la elaboración de un CRUD con funcionalidades básicas para entender el correcto funcionamiento de Springboot. Luego, se procede a establecer mejorar para hacer el CRUD un poco más robusto.

# Tecnologías utilizadas
- Visual Studio Code: 1.64.2
- Springboot: 2.6.3
- Java: 11

# Inicio del programa
Se ejecuta el .java que contenga la anotación @SpringBootApplication

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/main.JPG" width="500" height="150" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/main2.JPG" width="500" height="200" title="mainApp">

# Funcionalidades
## GET
- Solicitud General

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuarios.JPG" width="1500" height="500" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuarios2.JPG" width="1500" height="500" title="mainApp">

- Solicitud individual

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuarioN5.JPG" width="700" height="500" title="mainApp">

- Solicitud para obtener usuarios con prioridad 5

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuariosP5.JPG" width="700" height="500" title="mainApp">

## Extras/Mejoras

- Solicitud general pero ordenando alfabéticamente por el nombre

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuariosOrdenNombre.JPG" width="700" height="500" title="mainApp">

Se agregó un nuevo usuario, y se confirmó que se realiza el ordenamiento correctamente

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuariosOrdenNombre2.JPG" width="700" height="500" title="mainApp">

- Obtener usuarios por inicial

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/getUsuariosInicial.JPG" width="700" height="500" title="mainApp">

## POST

A esta funcionalidad se le agregó el extra/mejora de establecer un formato para el correo electrónico por medio de regex. Así mismo utilizando excepciones, se controla este comportamiento

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/postUsuarioRegex.JPG" width="900" height="70" title="mainApp">

- Controlando con la excepción que se cumpla lo del formato

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/postUsuarioRegexEx.JPG" width="900" height="500" title="mainApp">

- Registro de usuario: Como respuesta se obtiene un 200 OK y adicional se devuelve el ingreso nuevo con el id correspondiente

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/postUsuario.JPG" width="900" height="500" title="mainApp">

## PUT

Esta funcionalidad constituye un extra/mejora en el CRUD para la actualización de información existente. Adicional, tiene soporte con una excepción personalizada que controla este escenario.

- Antes de la actualización

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario.JPG" width="500" height="500" title="mainApp">

- Actualizando

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario2.JPG" width="700" height="500" title="mainApp">

- Revisando si se dio la actualización

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario3.JPG" width="450" height="500" title="mainApp">

- Funcionalidad de la excepción

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuarioEx.JPG" width="800" height="500" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuarioEx2.JPG" width="800" height="250" title="mainApp">

## DELETE

A esta funcionalidad se le agregó el extra/mejora de primero confirmar que el usuario a eliminar exista a través de la misma excepción agregada al PUT.

- Eliminando usuario con id 14

Antes de la eliminación 

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuario.JPG" width="700" height="500" title="mainApp">

Eliminando

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuario2.JPG" width="700" height="500" title="mainApp">

Confirmando que ya no existe

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuario3.JPG" width="700" height="500" title="mainApp">


- Funcionalidad de la excepción: No existe el usuario con id 10

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuarioEx.JPG" width="700" height="300" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuarioEx2.JPG" width="700" height="150" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/deleteUsuario3.JPG" width="700" height="500" title="mainApp">

# Observación
- Los ejemplos demostrados en las capturas pueden no existir por los ajustes que ha venido teniendo el código conforme se implementan o prueban las mejoras. Para validación de funcionamiento de todos los puntos mencionados, se recomienda hacer un get con el endpoint http://localhost:8081/usuario/all para saber los registros disponibles si se tiene acceso a la base de datos original. Caso contrario, crear una nueva base de datos e ir ingresando información para probar todas las funcionalidades validadas en las capturas.

# Conclusiones
- CRUD repository es útil para tener un primer acercamiento a las API con Springboot. Sin embargo, para APIs más profesionales, se recomienda usar JPA Repository en conjunto con Hibernate
- Springboot es el framework que facilita el uso de Spring, haciendo que el programador sólo se preocupe por implementar utilidad, abstrayendo los procesos que involucran comandos de SQL.
- La inyección de dependencias es el corazón de springboot y junto con una buena estructura de paquetes, da origen a proyectos robustos y de fácil gestión.
