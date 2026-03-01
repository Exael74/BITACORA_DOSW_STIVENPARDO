# Builder Pattern

## Descripción
El patrón Builder es un patrón de diseño creacional que permite construir objetos complejos paso a paso. Este patrón permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción, separando el proceso de construcción de su representación.

## ¿Cuándo usarlo? (Casos de uso)
- Cuando la creación de un objeto requiere muchos pasos y parámetros, especialmente cuando la mayoría de los parámetros son opcionales o tienen valores predeterminados (para evitar el "telescoping constructor anti-pattern").
- Cuando necesitas crear diferentes representaciones de un producto complejo usando un mismo proceso de construcción (por ejemplo, construir casas de madera y casas de piedra).
- Cuando la creación de las partes del objeto es compleja.
