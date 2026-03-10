# Proyecto: Simulador Naval (Decorator)

## Descripción General
Este proyecto aplica el patrón Decorator a un simulador táctico naval. Un buque o barco base comienza con características de guerra pobres, y mediante "Añadidos" de equipamiento envolventes (Decoradores), el cliente puede dotarlo de más potencia de ataque (ATK) o defensa (DEF) en tiempo real sin modificar su clase original.

## Flujo de Funcionamiento
1. **El Componente (`Barco`):** Interfaz o clase abstracta que define los métodos estructurales comunes: `getATK()`, `getDEF()` y `getDescription()`.
2. **El Componente Concreto (`BaseShip`):** Implementa a `Barco`. Representa el estado primario del navío con parámetros básicos (ej. 10 de ataque y 10 de defensa).
3. **El Decorador Base (`BaseShipDecorator`):** La clase base para todos los decoradores que también cumple con la interfaz `Barco`. Recibe como parámetro un objeto `Barco` dentro de su constructor (lo envuelve) y guarda su referencia. Sus métodos por defecto simplemente delegan la ejecución al barco envuelto.
4. **Los Decoradores Concretos:** 
   - `BlindajeDecorator`: Suma puntos pasivos de defensa extra.
   - `RadarDecorator`, `MisilesDecorator`, `AntiTorpedosDecorator`: Suman variados perfiles de ataque y defensa al componente empaquetado y alteran su descripción de texto para relatar sus diferentes nuevas integraciones.
5. **Ejecución (`MainClass`):**
   - El simulador inicia con un simple `BaseShip` desnudo.
   - Utilizando una lista con una configuración deseada (Blindaje, Misiles, etc.), un bucle toma el barco en su estado vigente y le inyecta una y otra vez nuevos decoradores, envolviendo el objeto anterior dentro de uno nuevo, como capas de una cebolla (`barcoFinal = new BlindajeDecorator(barcoFinal)`).
   - Al imprimirse la información final, las llamadas se propagan desde la última capa exterior hacia el interior de las interfaces y se devuelve el acumulado total de todas las estadísticas de las mejoras aplicadas.
