# Strategy Pattern

## Descripción
El patrón Strategy es un patrón de diseño de comportamiento que permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada (estrategias) y hacer que sus objetos sean intercambiables. Este patrón permite que el algoritmo varíe independientemente de los clientes que lo utilicen.

## ¿Cuándo usarlo? (Casos de uso)
- Cuando tienes muchas clases similares que solo difieren en la forma en que ejecutan algún comportamiento particular (variaciones de algoritmos).
- Cuando necesitas utilizar diferentes variantes de un algoritmo en diferentes momentos dentro del ciclo de vida de un objeto.
- Para aislar la lógica de un negocio de los detalles de implementación de los algoritmos que puedan no ser vitales para el primer plano de la aplicación.
- Para reemplazar un comando condicional múltiple gigante (`if` o `switch` sobre múltiples algoritmos) con polimorfismo estructurado.
