# Chain of Responsibility Pattern

## Descripción
El patrón Chain of Responsibility (Cadena de Responsabilidad) es un patrón de diseño de comportamiento que permite pasar solicitudes a lo largo de una cadena de manejadores (handlers). Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.

## ¿Cuándo usarlo? (Casos de uso)
- Cuando se espera que más de un objeto pueda manejar una petición, y el manejador específico no se conoce a priori.
- Cuando deseas emitir una solicitud a uno de varios objetos sin especificar explícitamente el receptor.
- Cuando el conjunto de objetos que pueden manejar una solicitud debe cambiar dinámicamente en tiempo de ejecución.
- Útil para sistemas de validación, filtros o procesamiento de eventos estructurado en capas.
