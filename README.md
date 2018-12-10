# iwaBD
Para levantar el backend, require una base de datos llamada iwasoft en una BD Mysql
Tambien se require la creación de un usuario
las querys para la creacion del usuario y los permisos son los siguientes:

create user 'springuser'@'%' identified by 'ThePassword'; 

grant all on db_example.* to 'springuser'@'%';

# iwaBackend
 Despues clonar el proyecto y abrirlo con eclipse.
 
 Despues actualizar con maven para bajar las dependencias.
 
 Ejecutar el archivo App.java dentro del paquete com.ignacio1250.iwasoft.app
 
# iwaFront
 Clonar el repositorio: 
 https://github.com/Ignacio1250/iwaFront.git
 
 ejecutar el proyecto con el comando ng serve -o
 


