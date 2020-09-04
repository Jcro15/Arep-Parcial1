# Parcial primer tercio
## Requerimientos
1. Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada. Para probar, y para ver como el browser arma el query, puede usar una cadena puede enviarla en un solo campo con valores separados por comas. Ayuda: use un form html con un solo campo.
2. Usted debe implementar el ordenamiento por medio de bubble sort. Piense que este algoritmo se podría user para objetos de otro tipo.
3. Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.
4. Agregue una operaciónes para calcular la sumatoria  y el promedio de la lista y modifique su programa para que la estructura Json contenga estos valores.
5. El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.
6. Despliegue el servicio en Heroku.
7. Construya un cliente JAVA para probar el servicio en heroku.
8. El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.
9. El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

## Pre-requisitos
* [Maven](https://maven.apache.org/) - Administrador de dependencias
* [Git](https://git-scm.com/) - Sistema de control de versiones 

## Instrucciones de uso

Para descargar el proyecto se debe usar 
```
git clone https://github.com/Jcro15/Arep-Parcial1
```

Una vez descargado el proyecto este debe compilarse con la siguiente instrucción

```
mvn package 
```

Para ejecutar la aplicación se debe usar el comando 

```
mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.SparkWebApp"
```
Para ejecutar el cliente

```
mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.client.Client"
```

Para ejecutar las pruebas del proyecto se debe usar el comando
```
mvn test
```
La documentación se puede encontrar en la carpeta Javadoc o puede generarse en 
la ubicación target\site\apidocs\index.html utilizando el comando
```
mvn javadoc:javadoc
```

## Enlace Heroku
  [Despliegue en Heroku](https://arep-parcial-rojas.herokuapp.com/calcular)

## Construido con

* [Maven](https://maven.apache.org/) - Administrador de dependencias
* [Junit](https://junit.org/junit5/) - Framework para pruebas en java
* [Spark](http://sparkjava.com/) - Micro-framework para desarrollar aplicaciones web

## Autor

* **Juan Camilo Rojas Ortiz** - *Estudiante de ingeniería de sistemas* 

## Licencia

Este proyecto esta bajo la licencia GNU(General Public License) los detalles se pueden encontrar en el archivo [LICENSE](LICENSE)

