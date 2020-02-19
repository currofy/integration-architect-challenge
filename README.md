# Integration Architect Challenge

[![Join the chat at https://gitter.im/currofy/integration-architect-challenge](https://badges.gitter.im/currofy/integration-architect-challenge.svg)](https://gitter.im/currofy/integration-architect-challenge?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## Diseña un API para la gestión de una ticketera electrónica

### Objetivo:

El proyecto consiste en crear una ticketera electrónica para los clientes de una empresa de venta al público. La ticketera permitirá asociar tus tickets de venta y posteriormente poder consultarlos, o eliminarlos.

Para ello, dispones de las siguientes entidades a nivel de negocio:

**Ticket**:

Un ticket es generado en una caja de una tienda, contiene una lista de artículos, indicando de cada
uno su nombre, talla, precio y número de unidades. Contiene también el precio total y la fecha.

**Artículo**:

Un artículo tiene un nombre, una descripción, un código identificativo interno, talla, color,
materiales con los que ha sido hecho, origen de fabricación, precio en cada uno de los mercados
en los que está en venta, familia del artículo, temporadas en las que está / estuvo en venta,
las fotos del artículo y más información.

**Tienda**:

Una tienda tiene una localización, una superficie comercial, un nombre de tienda, un código interno
de negocio, información sobre las secciones que acoje, estimación de venta anual, etc.

**Cliente**:

De un cliente tenemos inicialmente el nombre y apellidos, su dirección de correo electrónico,
dirección física y número de teléfono. Queremos saber también los tickets de las compras que
ha realizado.

1. Ejercicio 1.  
   Diseña un API que permita construir una aplicación frontal para listar los tickets de un cliente,
   asociar un ticket, eliminar un ticket, etc. viendo para cada ticket el importe total, la tienda en la que ha sido comprado, la fecha y el número de artículos.

   Debe permitir mostrar los artículos del ticket, mostrando para cada uno la descripción, color,
   talla, foto e importe en el momento de la compra (tener en cuenta que pudo haber sido vendido
   con algún tipo de rebaja o descuento).

   Deja el API diseñada en el directorio ./api.

2. Ejercicio 2.  
   Suponiendo que vamos a guardar la información en una base de datos documental, diseña la estructura
   de los documentos a almacenar en la base de datos. Guarda dicha estructura en el directorio ./data/model.

3. Ejercicio 3.  
   Conecta la aplicación spring boot del ejemplo, que actualmente está conectada con una base de datos
   h2, a una base de datos documental a tu elección. Explica la elección.

4. Ejercicio 4.  
   Implementa **una** de las APIs diseñadas a tu elección.

5. Ejercicio 5.  
   Si un API de modificación, tiene que ser implementando guardando la información en la base de datos
   documental y enviando un mensaje a un sistema de mensajería, de forma atómica,
   ¿cómo lo harías teniendo en cuenta que los orígenes pueden no ser transaccionales?

6. Ejercicio 6.  
   Si tuvieses que orquestar poder llamar a varias APIs de forma transaccional, ¿cómo lo harías?

## Algunas consideraciones:

Esta prueba es una aplicación Spring Boot, si no estás familiarizado con el framework échale un ojo a las que indicamos en SpringBootHelp.md

Puedes usar el fichero answers.md dejar tus respuestas y comentarios.

Puedes aplicar las mejoras que consideres. Esto es una primera versión, un experimento, que queremos ir mejorando con vuestras ideas consejos. Al final somos todos arquitectos, simplemente comparte tus razones, puedes usar answers.md o una PR.

Para los datos, monta la base de datos a tu elección, ya sea con una librería java que arranque el motor de base de datos en los tests, o bien arrancando una imagen docker (docker | cri-o | podman | etc.). Por favor deja las instrucciones correspondientes si es necesario arrancarla previamente al ciclo de construcción maven.

Finalmente, hemos creado una Room en Gitter para este ejercicio, cualquier cosa que necesites, dudas, comentarios, impresiones, quejas o sugerencias haznoslo saber.
