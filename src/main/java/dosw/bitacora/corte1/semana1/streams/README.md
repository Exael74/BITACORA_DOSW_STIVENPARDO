# Semana 1: Uso de Java Streams 

En este módulo se trabajó en el procesamiento declarativo de colecciones usando la API de Streams en Java, aplicando distintos operadores como `filter`, `map`, `sorted`, `collect`, `peek` y `anyMatch`.

## Prácticas Implementadas

1. **Ejercicio 1:** Filtrar una lista de calificaciones para obtener solo las que son pares y mayores a 10.
2. **Ejercicio 2:** Procesar un listado de frutas, seleccionando las de más de 4 letras, convirtiéndolas a mayúsculas y ordenándolas.
3. **Ejercicio 3:** Filtrar una lista de empleados para encontrar los que están en estado "activo" y extraer únicamente sus nombres.
4. **Ejercicio 4:** Evaluar objetos de tipo Persona para obtener una lista exclusiva de aquellos que sean mayores de edad (>= 18).
5. **Ejercicio 5:** Validar un lote de transacciones simulando monitoreo usando `peek`, y usando `anyMatch` para verificar la existencia de transacciones de alto valor en estado pendiente.

## Retroalimentación Personal

**¿Qué asimilé con estas prácticas?**
Comprendí cómo Java Stream permite reducir drásticamente las líneas de código al reemplazar bucles anidados y condicionales complejos por tuberías de operaciones encadenadas (`pipelines`), lo que también incrementa la legibilidad del código.

**¿Qué aspectos puedo mejorar?**
Aún requiero mayor práctica para dominar por completo agrupaciones complejas utilizando `Collectors.groupingBy` y la implementación eficiente de expresiones lambda junto con métodos referenciados (`::`).
