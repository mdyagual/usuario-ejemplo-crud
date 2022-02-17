# Sofka: usuario-ejemplo-crud
Implementación básica guiada de un CRUD para luego establecer mejoras.
Esta práctica consiste en la elaboración de un CRUD con funcionalidades básicas para entender el correcto funcionamiento de Springboot. Luego, se procede a establecer mejorar para hacer el CRUD un poco más robusto.

# Tecnologías utilizadas
- Aqui voy a listar las tecnologías utilizadas

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

- Registro de usuario: Como respuesta se obtiene un 200 OK y adicional se devuelve el ingreso nuevo con el id correspondiente

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/postUsuario.JPG" width="700" height="500" title="mainApp">

## PUT

Esta funcionalidad constituye un extra en el CRUD para la actualización de información existente. Adicional, tiene soporte con una excepción personalizada que controla este escenario.

- Antes de la actualización

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario.JPG" width="500" height="500" title="mainApp">

- Actualizando

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario2.JPG" width="700" height="500" title="mainApp">

- Revisando si se dio la actualización

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuario3.JPG" width="450" height="500" title="mainApp">

- Funcionalidad de la excepción

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuarioEx.JPG" width="800" height="500" title="mainApp">

<img src="https://github.com/mdyagual/usuario-ejemplo-crud/blob/master/ss/updateUsuarioEx2.JPG" width="800" height="250" title="mainApp">

