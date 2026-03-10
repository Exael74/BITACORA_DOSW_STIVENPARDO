# Bridge Pattern

## Descripción
El patrón Bridge es un patrón de diseño estructural que permite dividir una clase grande o un grupo de clases estrechamente relacionadas en dos jerarquías separadas (abstracción e implementación) que pueden desarrollarse independientemente la una de la otra.

## ¿Cuándo usarlo? (Casos de uso)
- Cuando quieres separar una abstracción (la lógica de control de alto nivel) de su implementación (las operaciones de bajo nivel) de modo que ambas puedan ser modificadas de forma independiente.
- Cuando necesitas extender una clase en varias dimensiones ortogonales (por ejemplo, una forma geométrica con diferentes sistemas operativos de renderizado).
- Cuando quieres cambiar la implementación en tiempo de ejecución.
