# Proyecto: Construcción de Figuras/Muñecos (Builder)

## Descripción General
Este proyecto utiliza el patrón Builder para ensamblar paso a paso una instancia bastante compleja: un `ToyDoll` (muñeco de juguete). Este objeto muñeco requiere varios componentes (cabeza, torso, brazos, piernas) y construirlo de un solo intento sería muy desorganizado o llenaría su constructor de parámetros inservibles.

## Flujo de Funcionamiento
1. **La clase compleja (`ToyDoll`):** Representa el objeto a construir con una estructura pesada o una extensa lista de atributos.
2. **El Builder (Constructores):** Hay una interfaz (o clase abstracta) base llamada `ToyDollBuilder`. De esa surgen constructores específicos:
   - `ActionDollBuilder`: Ensambla las partes de una figura de acción.
   - `ClassicDollBuilder`: Ensambla las partes de un muñeco clásico.
3. **El Director (`ToyFactory`):** El proceso de construcción no lo hace directamente el cliente. Interviene el "Director", quien tiene el control y los pasos ordenados ("ponle manos, luego pon piernas..."). El director recibe un Builder específico inyectado y manda las instrucciones de ensamblaje.
4. **Ejecución (`MainClass`):** Se instancia el `ToyFactory` (director) dándole las órdenes a un `ActionDollBuilder`. Una vez ha terminado (`constructDoll()`), el cliente demanda al builder que le regrese la instancia ya generada y probada: `builder.getToyDoll()`. Luego se muestran sus atributos de creación por pantalla (`showInfo()`). Se repite esto dinámicamente para el `ClassicDollBuilder`.
