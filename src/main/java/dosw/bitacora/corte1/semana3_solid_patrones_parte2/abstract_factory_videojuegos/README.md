# Abstract Factory Pattern

## Descripción
El patrón Abstract Factory es un patrón de diseño creacional que permite producir familias de objetos relacionados o dependientes sin especificar sus clases concretas. Proporciona una interfaz para crear objetos de cada tipo sin que el código cliente deba conocer los detalles de instanciación.

## ¿Cuándo usarlo? (Casos de uso)
- Cuando el código de tu programa debe funcionar con varias familias de productos relacionados, pero no deseas que dependa de las clases concretas de esos productos (ya sea porque son desconocidos de antemano o simplemente para permitir la extensibilidad futura).
- Cuando tienes un sistema que debe ser configurado con una de entre múltiples familias de productos.
- Cuando quieres garantizar que los productos de una familia se usen juntos de forma consistente.
