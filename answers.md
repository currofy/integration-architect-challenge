# Answers
Ejercicio 1

Usé swagger para hacer la documentación. Así que al levantar la aplicación (si está en local) basta con acceder a 

http://localhost:8080/swagger-ui/index.html 

y en la barra de exploración /v3/api-docs/

Por si no estuvieseis familiarizados con Swagger, esta herramienta tiene la ventaja de pegar la documentación al código, y además de lo rápido que es de implementar y lo sencillo de mantener, tiene la ventaja de  genera documentación funcional, es decir, que permite hacer pruebas directamente sobre la herramienta (como un postman embebido en la documentación),

En cuánto al ejercicio en si, se me escapan totalmente las reglas de negocio, por lo que hice un CRUD sobre el objeto de los tickets (naturalmente enriquecido con todos los detalles que solicitabais).
Asumo que en un ambiente real esto no corresponde con una implementación viable, puesto que se suelen montar servicios mucho más específicos sobre algún dato concreto del tikcet, y no sobre todo el objeto.

En este sentido seguramente tendría que haber servicios del estilo a:

/commercial-discount/{ticketId}/{percent}

Que generase una rebaja adicional, sobre el total del ticket etc.. Pero como digo, al no estár en especificaciones y no tener claro cuales son las reglas, preferí ser prudente.

Para una prueba rápida, dockericé la aplicación y subí una imagen a dockerhub:
docker pull esepeasodegabi/currofy:latest

Ejercicio 2

La aplicación al arrancar busca un mongodb en localhost e inserta unos datos para que se puedan probar los servicios. 

Ejercicio 3

Sin tener mucha más información acerca de la disponibilidad de hardware, la cantidad de instancias de base de datos, de la cantidad de tráfico máximo y medio, opté por mongdb, basándome sobre todo en temas de cantidad de comunidad, y flexibilidad. Se trata de la base de datos nosql más utilizada y sin conocer los problemas concretos me parece la decisión más versátil.

Ejercicio 4

Implementé la que me pareció más significativa, que es la de la consulta de tickets por usuario


Ejercicio 5

Las bases de datos documentales suelen tener funciones de callback para las inserciones y modificaciones que se pueden utilizar en este caso para disparar desde esa función la llamada al servicio de mensajería.

Ejercicio 6

Conozco dos formas de hacer esto. O bien hacemos doble verificación para cada uno de los servicios involucrados (2PC) con una llamada final de ejecución en todos ellos, o bien vamos llamando a uno tras otro de forma síncrona, es decir, con el ok de cada uno llamamos al siguiente. Normalmente se toma la decisión de una u otra en función de si existe posibilidad de llamada de servicios de rollback, y de un tema de recursos (2PC suele ser menos eficiente). También puede depender del control que tengamos sobre el resto de API involucradas
