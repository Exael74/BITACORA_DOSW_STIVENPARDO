# Command Pattern

## Descripción
El patrón Command es un patrón de diseño de comportamiento que transforma una solicitud en un objeto independiente que contiene toda la información sobre la misma. Esta transformación permite parametrizar métodos con diferentes solicitudes, retrasar o encolar la ejecución de una solicitud y soportar operaciones que se pueden deshacer (undo).

## ¿Cuándo usarlo? (Casos de uso)
- Cuando necesitas parametrizar objetos con acciones (como callbacks en programación procedimental).
- Cuando quieres encolar operaciones, programar su ejecución, o ejecutarlas remotamente.
- Cuando necesitas implementar operaciones reversibles (Deshacer/Rehacer o Undo/Redo).
- Cuando se desea estructurar un sistema en torno a operaciones de alto nivel que actúan basándose en primitivas (para transacciones).
