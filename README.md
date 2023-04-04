```
# Proyecto Java que implementa Spring en la capa de persistencia para un banco
Este proyecto es una aplicación de escritorio que simula las funcionalidades básicas de un banco, como agregar clientes, verificar extractos, realizar transacciones, etc. La aplicación se basa en una base de datos y utiliza el framework Spring en la capa de persistencia para manejar la interacción con la base de datos.

## Dependencias
El proyecto incluye las siguientes dependencias necesarias:

- JUnit 4.13.2
- javax.annotation-api 1.3.2
- Spring Data JPA 2.7.0
- Apache Commons DBCP 1.4
- Hibernate Core 5.6.15.Final
- MySQL Connector/J 8.0.32
- SQLite JDBC 3.41.2.1

Estas dependencias se incluyen en el archivo pom.xml, por lo que se deben descargar automáticamente al construir el proyecto con Maven.

## Ejecución
Para ejecutar la aplicación, simplemente ejecuta la clase "Main.java" ubicada en la ruta src/main/java/com/bank/Main.java. Esto iniciará la interfaz gráfica de usuario basada en JFrame.

Es importante tener en cuenta que para utilizar esta aplicación es necesario generar una base de datos previamente. Se incluye un script para la creación de la base de datos en el archivo "50_Banco.sql". Para generar la base de datos, se recomienda utilizar una herramienta como MySQL Workbench.

Una vez que la base de datos ha sido creada, es necesario configurar los datos de acceso en el archivo "banco.properties" ubicado en la ruta "src/main/resources". En este archivo se encuentran las propiedades necesarias para establecer la conexión con la base de datos, como el nombre de usuario, la contraseña y la URL de la base de datos.

## Funcionalidades
La aplicación ofrece las siguientes funcionalidades básicas:

- Agregar un nuevo cliente con información personal y de contacto
- Ver una lista de todos los clientes registrados
- Ver la información detallada de un cliente específico
- Actualizar la información de un cliente
- Eliminar un cliente
- Ver el extracto bancario de un cliente para un período de tiempo específico
```
